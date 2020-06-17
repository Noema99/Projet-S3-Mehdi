/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import models.repas;

/**
 *
 * @author BENADADA Noema
 */
public class Repasbd {
        
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
      public static int save (repas r) {

        int status = 0 ;
        try{
            Connection conn  = Repasbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.repas ( nomR, quantite, prixunitaire) values (?,?,?)") ;
           
           ps.setString(1,r.getNomR());
           ps.setString(2,r.getQuantite());
           ps.setString(3,r.getPrixunitaire());
         
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
          public static int savev (repas v) {

        int status = 0 ;
        try{
            Connection conn  = Repasbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.repas ( nomR, quatite, prixunitaire) values (?,?,?)") ;
           
           ps.setString(1,v.getNomR());
           ps.setString(2,v.getQuantite());
           
           ps.setString(3,v.getPrixunitaire());
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }

      public static int modify ( repas r ) {
        int status = 0 ;
        try{
            Connection conn  = Repasbd.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.repas set quantite = ?, prixunitaire = ?  where nomR = ? ") ;
          
          
           
         
            
            ps.setString(1,r.getQuantite());
            
             ps.setString(2,r.getPrixunitaire());
             
               ps.setString(3,r.getNomR()) ;
          
           
           System.out.println(ps);
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
   
      
         public static int delete (String nomR) {
 
        int status = 0 ;
        try{
            Connection conn  = Repasbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("delete from ps3.repas where nomR = ?  ") ;
             
            ps.setString(1,nomR);
          
            status = ps.executeUpdate() ; 
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
}
