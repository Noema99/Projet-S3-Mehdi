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
import java.util.ArrayList;
import java.util.List;
import models.Voyage;
import models.place;
import models.voiture;

/**
 *
 * @author BENADADA Noema
 */
public class Voiturebd {
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
       public static int saveReservationVoiture(voiture v) {

        int status = 0 ;
        try{
            Connection conn  = Voiturebd.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.voiture  (numvoiture) values (?)") ;
          
            ps.setString(1,v.getNumvoiture());
           
       
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
     public static voiture getplaces(String numvoiture){
                    voiture Voiture = new voiture();

              System.out.print(numvoiture);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select * from voiture where numvoiture= ? ") ;
            
            
          ps1.setString ( 1, numvoiture ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                    Voiture.setNumvoiture(numvoiture);
                    Voiture.setplace1(rs1.getString(2));
                    Voiture.setplace2(rs1.getString(3));
                    Voiture.setplace3(rs1.getString(4));
                    Voiture.setplace4(rs1.getString(5));
                    Voiture.setplace5(rs1.getString(6));
                    Voiture.setplace6(rs1.getString(7));
                    Voiture.setplace7(rs1.getString(8));
                    Voiture.setplace8(rs1.getString(9));
                    Voiture.setplace9(rs1.getString(10));
                    Voiture.setplace10(rs1.getString(11));
                    Voiture.setplace11(rs1.getString(12));
                    Voiture.setplace12(rs1.getString(13));
                    Voiture.setplace13(rs1.getString(14));
                    Voiture.setplace14(rs1.getString(15));
                    Voiture.setplace15(rs1.getString(16));
                    Voiture.setplace16(rs1.getString(17));
                    Voiture.setplace17(rs1.getString(18));
                    Voiture.setplace18(rs1.getString(19));
                    Voiture.setplace19(rs1.getString(20));
                    Voiture.setplace20(rs1.getString(21));
                    Voiture.setplace21(rs1.getString(22));
                    Voiture.setplace22(rs1.getString(23));
                    Voiture.setplace23(rs1.getString(24));
                    Voiture.setplace24(rs1.getString(25));

                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numvoiture);
                                System.out.print("kk");

                return Voiture;
          }
      public static int setPlace1 ( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place1 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
        public static int setPlace2 ( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place2 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
     public static int setPlace3( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place3 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
     }
       public static int setPlace4( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place4 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
         public static int setPlace5( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place5 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
           public static int setPlace6( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place6 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
             public static int setPlace7( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place7 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
               public static int setPlace8( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place8 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                 public static int setPlace9( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place9 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                   public static int setPlace10( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place10 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                     public static int setPlace11( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place11 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                       public static int setPlace12( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place12 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                         public static int setPlace13( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place13 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                           public static int setPlace14( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place14 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                             public static int setPlace15( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place15 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                               public static int setPlace16( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place16 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                                 public static int setPlace17( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place17 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                                   public static int setPlace18( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place18 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                                     public static int setPlace19( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place19 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                                       public static int setPlace20( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place20 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
                                         public static int setPlace21( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place21 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }  public static int setPlace22( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place22 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
      public static int setPlace23( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place23 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
        public static int setPlace24( String numvoiture ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voiture set place24 = 'indispo' where numvoiture = ? ") ;
          
          
           
            ps.setString(1,numvoiture) ;
            
          
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
}     




