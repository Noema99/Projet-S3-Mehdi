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
import models.Utilisateur;

/**
 *
 * @author BENADADA Noema
 */
public class Utilisateurbd {
       public static Connection getConnexion () {
        Connection conn =null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ps3" , "root" , "") ;
         } catch(Exception e ){
             System.out.println(e) ;
                  
         }
        return conn ;
    }
       
       public static int  testutilisateur (String login,String password){

         try{
            Connection conn  = Utilisateurbd.getConnexion() ;

            PreparedStatement ps= conn.prepareStatement("select * from utilisateur ") ;

               ResultSet rs  = ps.executeQuery() ;            

                while ( rs.next()) {
                
                       
                 System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa"+rs.getString(1));
                 System.out.println("///////////////////////////****");
                if( rs.getString(2).equals(password)&&rs.getString(1).equals(login)) return 1 ;
                
              
             }
               conn.close();
  
                 

        }
     
     
     catch(Exception e) {
            System.out.println(e) ;
        }
  
     return -1;
     }
     
      public static int save (Utilisateur utilisateur) {

        int status = 0 ;
        try{
            Connection conn  = Utilisateurbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.utilisateur (email ,motDePasse ) values (?,?)") ;
           
            ps.setString(1,utilisateur.getEmail());
            ps.setString(2,utilisateur.getMotDePasse());
         
  
            
           
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
    
     
}
