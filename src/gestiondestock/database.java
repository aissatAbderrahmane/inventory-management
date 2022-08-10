
package gestiondestock;
import java.sql.*;
public class database {
    private Connection connect; // pour ouverire la connection avec la base de donnée
    private Statement stat = null; // pour execution des requets SQL
    private ResultSet result = null; // pour avoir les resultat d'une requete generalement (SELECT)
    public void Connect() throws ClassNotFoundException{
        Class.forName("org.sqlite.JDBC");   
        try{
            connect = DriverManager.getConnection("jdbc:sqlite:database.stock");
            stat = connect.createStatement();
        }catch(SQLException e){
            System.out.println("Error SQL :"+e.getMessage());
        }
    }
    public void Close() throws SQLException{
        connect.close();
    }
    public void select(String table, String Row, String where, String LIMIT) throws SQLException{
        // Pour Selectionné
        if(!"".equals(table)){
            if("".equals(Row)) Row = "*";
            result = stat.executeQuery("select "+Row+" from "+ table + "" + where + ((!"".equals(LIMIT)) ? " limit "+LIMIT : ""));
        }else{
            System.out.println("Error SQL , select il faut donner le nom du tableaux");
        }
    }
    public void insert(String table, String Values) throws SQLException{
        // Pour Ajouter
        stat.executeUpdate("insert into "+table+" values ('',"+Values+");");
    }
    public void update(String table, String rowsupdate, String where) throws SQLException{
        // Pour modifier
        if(!"".equals(table) && !"".equals(rowsupdate) && !"".equals(where))
        stat.executeUpdate("update "+table+" set "+rowsupdate+" where "+where);
        else System.out.println("Error SQL , Update il faut donner tout les champs correctement");
    }
    public void delete(String table, String where) throws SQLException{
        // Pour Suprimmé
        if(!"".equals(table)  && !"".equals(where))
        stat.executeUpdate("delete from "+table+" where "+where);
        else System.out.println("Error SQL , delete il faut donner tout les champs correctement");   
    }
    public ResultSet getResult(){
        // return les resultat du selection.
        return result;
    }
}
