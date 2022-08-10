/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondestock;

import java.util.regex.Pattern;

/**
 *
 * @author hp
 */
public class Outils {

  
        
    int StringToInt(String txt){
        int num;
            num = Integer.parseInt(txt);
        return ((num >=0) ? num : -1);
    }
     public  String[] fromtableToStr(String s){
         int ver=0;
         String[] c = null;
         char temp = '\0';
         for(int i=0;i< s.length();i++){
            temp = s.charAt(i);
         if (temp =='/' || temp=='-')
            ver++;
         else continue;
         if(ver == 2 && temp=='/')
           c = s.split(Pattern.quote("/"));
         else if(ver == 2 && temp=='-') 
           c = s.split(Pattern.quote("-"));
         }
         return c;
     }
     
     public Boolean VerifyDate(String[] s){
            for(int i = 0; i<s.length;i++){
                if(StringToInt(s[i]) > -1 ){
                    
                }
            }
         
         return false;
     }
     
}
