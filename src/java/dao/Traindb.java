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

import models.train;

/**
 *
 * @author BENADADA Noema
 */
public class Traindb {
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
      public static int saveTrain(train t) {

        int status = 0 ;
        try{
            Connection conn  = Reservationbd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.train (numtrain) values (?)") ;
          
            ps.setString(1,t.getNumtrain());
           
       
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
        public static int save (train t) {

        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.train values (?,?,?,?,?,?,?,?,?)") ;
           
           ps.setString(1,t.getNumtrain());
        ps.setString(2,t.getVoiture1());
       ps.setString(3,t.getVoiture2());
       ps.setString(4,t.getVoiture3());
       ps.setString(5,t.getVoiture4());
       ps.setString(6,t.getVoiture5());
       ps.setString(7,t.getVoiture6());
       ps.setString(8,t.getVoiture7());
       ps.setString(9,t.getVoiture8());
       
    
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
         public static String getnumVoiture1(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture1 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
     public static String getnumVoiture2(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture2 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
      public static String getnumVoiture3(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture3 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
       public static String getnumVoiture4(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture4 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
        public static String getnumVoiture5(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture5 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
         public static String getnumVoiture6(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture6 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
          public static String getnumVoiture7 (String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture7 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
           public static String getnumVoiture8(String numtrain,String place){
              String numvoiture = "a";
              System.out.print(numtrain);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select voiture8 from train where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numtrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numvoiture = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return numvoiture;
          }
}
