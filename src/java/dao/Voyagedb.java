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
import models.trainessaie;

/**
 *
 * @author BENADADA Noema
 */
public class Voyagedb {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



    
    
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
     
          public static List<Voyage> getAllVoyage(String gareDepart,String gareArrivee,String dateDepart) {
        List<Voyage> list = new ArrayList<Voyage>() ;
         try{
            Connection conn  = Voyagedb.getConnexion() ;
            
            PreparedStatement ps= conn.prepareStatement("select * from voyage ") ;
         
            
            ResultSet rs  = ps.executeQuery() ;
            
             while ( rs.next()) {
                
                 Voyage v= new Voyage() ;
                 if (rs.getString(1).equals(gareDepart)&&rs.getString(2).equals(gareArrivee)&&rs.getString(3).equals(dateDepart)){
                 v.setLabelVoyage(rs.getString(4));
                 v.setMontant(rs.getString(5));
                 v.setDuree(rs.getString(6));
                 v.setGareDepart(rs.getString(1));
                 v.setGareArrivee(rs.getString(2));
                 v.setDateDepart(rs.getString(3));
                 v.setDateArrivee(rs.getString(7));
                                  v.setNumtrain(rs.getString(8));
                 }

                
                 
                list.add(v) ;
                        
             }
               conn.close();

         }catch(Exception e) {
            System.out.println(e) ;
        }
        
        return list;
        
       }
          public static String getnumTrain(String numvoyage ){
              String numtrain = "a";
              System.out.print(numvoyage);
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select numtrain from voyage where labelVoyage= ? ") ;
            
            
          ps1.setString ( 1, numvoyage ) ;
            
             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                                  numtrain = rs1.getString(1);
                }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                System.out.print(numtrain);
                                System.out.print("eeee");

                return numtrain;
          }
    public static int save (Voyage v) {

        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.voyage ( labelVoyage , montant  , gareDepart, gareArrivee, dateDepart, dateArrivee, duree, numtrain) values (?,?,?,?,?,?,?,?)") ;
           
           ps.setString(1,v.getLabelVoyage());
           ps.setString(2,v.getMontant());
           ps.setString(3,v.getGareDepart());
           ps.setString(4,v.getGareArrivee()) ;
           ps.setString(5,v.getDateDepart());
           ps.setString(6,v.getDateArrivee()) ;
           ps.setString(7,v.getDuree()) ;
           ps.setString(8,v.getNumtrain()) ;
           
    
            status = ps.executeUpdate() ;

            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
     public static List<Voyage> getHorrairesDispo (String gareDepart, String gareArrivee, String dateDepart) {
        List<Voyage> list = new ArrayList<Voyage>() ;
         try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement("select * from voyage where gareDepart= ? and gareArrivee= ? and dateDepart=?") ;
            
            ps.setString ( 1, gareDepart ) ;
            ps.setString ( 2, gareArrivee ) ;
            ps.setString ( 3, dateDepart ) ;
            
             ResultSet rs  = ps.executeQuery() ;
             while ( rs.next()) {
                Voyage v= new Voyage() ;
                v.setGareDepart(rs.getString(3));
                v.setGareArrivee(rs.getString(4));
                v.setDateDepart(rs.getString(5));
                 
                list.add(v) ;
                        
             }
               conn.close();

         }catch(Exception e) {
            System.out.println(e) ;
        }
        
        return list;
        
       }
      public static List<Voyage> getHorrairesDispoClient (String gareDepart, String gareArrivee, String dateDepart) {
        List<Voyage> list = new ArrayList<Voyage>() ;
         try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select * from voyage where gareDepart= ? and gareArrivee= ? and dateDepart=?") ;
            
            ps1.setString ( 1, gareDepart ) ;
            ps1.setString ( 2, gareArrivee ) ;
            ps1.setString ( 3, dateDepart ) ;
            
             ResultSet rs1  = ps1.executeQuery() ;
             while ( rs1.next()) {
                Voyage vo= new Voyage() ;
                vo.setGareDepart(rs1.getString(3));
                vo.setGareArrivee(rs1.getString(4));
                vo.setDateDepart(rs1.getString(5));
                 
                list.add(vo) ;
                        
             }
               conn.close();

         }catch(Exception e) {
            System.out.println(e) ;
        }
        
        return list;
        
       }
   
     public static int modify ( Voyage newv ) {
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.voyage set montant = ?, gareDepart = ? ,gareArrivee = ? , dateDepart = ? ,   dateArrivee = ?  , duree = ? , numtrain = ? where labelVoyage = ? ") ;
          
          
           
            ps.setString(1,newv.getMontant()) ;
            
            ps.setString(2,newv.getGareDepart());
            
             ps.setString(3,newv.getGareArrivee ());
             
            ps.setString(4,newv.getDateDepart()) ;
            
            ps.setString(5,newv.getDateArrivee());
           
            ps.setString(6,newv.getDuree());
             ps.setString(7,newv.getNumtrain()) ;
           
            ps.setString(8,newv.getLabelVoyage()) ;
            
          
           
           System.out.println(ps);
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
   
      
         public static int delete (String labelVoyage, String numtrain) {
 
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("delete from ps3.voyage where labelVoyage = ? and numtrain=? ") ;
             
            ps.setString(1,labelVoyage);
            ps.setString(2, numtrain);
            status = ps.executeUpdate() ; 
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
         public static Voyage getVoyage(String numTrain){
                Voyage voyage = new Voyage();

              
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select * from voyage where numtrain= ? ") ;
            
            
          ps1.setString ( 1, numTrain ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                  voyage.setLabelVoyage(rs1.getString(1));
                  voyage.setMontant(rs1.getString(2));
                  voyage.setGareDepart(rs1.getString(3));
                  voyage.setGareArrivee(rs1.getString(4));
                  voyage.setDateDepart(rs1.getString(5));
                  voyage.setDateArrivee(rs1.getString(6));
                  voyage.setDuree(rs1.getString(7));
                  voyage.setNumtrain(rs1.getString(8));
      }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                                System.out.print("kk");

                return voyage; 
         }
}
