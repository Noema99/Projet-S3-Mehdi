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
import models.voiture;

public class Reservationbd {
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
      public static int saveReservation (reservation Reservation) {

        int status = 0 ;
        try{
            Connection conn  = Reservationbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.reservation (id,cinc, datereserv, heurereserv, numvoyage ) values (?,?,?,?,?)") ;
          
           ps.setString(1,Reservation.getId());
            ps.setString(2,Reservation.getCinc());
            ps.setString(3,Reservation.getDatereserv()) ;
            ps.setString(4,Reservation.getHeurereserv()) ;
            ps.setString(5,Reservation.getNumvoyage());
            
           
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
  

  
}
