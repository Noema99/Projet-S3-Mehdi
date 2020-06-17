/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author hp i5
 */
import models.reservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import models.commande;

public class Commandebd {
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
      public static int saveCommande (commande c) {

        int status = 0 ;
        try{
            Connection conn  = Reservationbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.commande (nomRepas ,qtite, PU, prixtotal ) values (?,?,?,?)") ;
           
            ps.setString(1,c.getNomRepas());
            ps.setString(2,c.getQtite());
            ps.setString(3,c.getPU()) ;
            ps.setString(4,c.getPrixtotal()) ;
            
            
           
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
      public static int delete (String cinc) {
 
        int status = 0 ;
        try{
            Connection conn  = Commandebd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("delete from ps3.commande where cinc=? ") ;
             
            ps.setString(1,cinc);
         
            status = ps.executeUpdate() ; 
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
}
