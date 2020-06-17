/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.admin;
import models.serveur;

/**
 *
 * @author Elfinou
 */
public class Serveurbd {
     public static Connection getConnexion () {
        Connection conn =null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ps3" , "root" , "") ;
            System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
         } catch(Exception e ){
             System.out.println(e) ;
                  
         }
        return conn ;
    }
     
     public static int  testserveur (String login,String password){

         try{
            Connection conn  = clientDB.getConnexion() ;

            PreparedStatement ps= conn.prepareStatement("select * from serveur ") ;

               ResultSet rs  = ps.executeQuery() ;            

                while ( rs.next()) {
                
                       
                 System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                 System.out.println("///////////////////////////****");
                if( rs.getString(2).equals(password)&&rs.getString(1).equals(login)){
                    return 1;
                 
                   
                }
              
             }
               conn.close();
        }
   
     catch(Exception e) {
            System.out.println(e) ;
        }
     return -1;
     }
     
     public static int modify ( serveur s) {
        int status = 0 ;
        try{
            Connection conn  = Serveurbd.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.serveur set login = ?, password = ? where matricule = ? ") ;
          
          
           
            ps.setString(1,s.getLogin()) ;
            
            ps.setString(2,s.getPassword());
            
             ps.setString(3,s.getMatricule());
             
           
           
           System.out.println(ps);
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
   
      
}
