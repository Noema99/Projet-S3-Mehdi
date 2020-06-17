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
import models.Client;
import models.admin;
/**
 *
 * @author BENADADA Noema
 */
public class clientDB {
    
    public static Connection getConnexion () {
        Connection conn =null ;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ps3" , "root" , "") ;
         } catch(Exception e ){
             System.out.println(e) ;
                  
         }
        System.out.println("ssssssssssssssssssssssssssssssssssssssssssssss" + conn);
        return conn ;
    }
    
     public static int  testclient (String login,String password){

         try{
            Connection conn  = clientDB.getConnexion() ;

            PreparedStatement ps= conn.prepareStatement("select * from client ") ;

               ResultSet rs  = ps.executeQuery() ;            
              
                while ( rs.next()) {
                    
                
                       
                 System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                 System.out.println("///////////////////////////****");
                if( rs.getString(8).equals(password)&&rs.getString(7).equals(login)){
                   String x = rs.getString(5);
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
      public static int save (Client client) {

        int status = 0 ;
        try{
            Connection conn  = clientDB.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.client (nom , prenom   , datenaissance, tel ,cin, addressemail,login,password ) values (?,?,?,?,?,?,?,?)") ;
           
            ps.setString(1,client.getNom());
            ps.setString(2,client.getPrenom());
            ps.setString(3,client.getDatenaissance()) ;
            ps.setString(4,client.getTel());
            ps.setString(5,client.getCin ());
            ps.setString(6,client.getAddressemail ());
            ps.setString(7,client.getLogin ());
            ps.setString(8,client.getPassword ());
            
           
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
          public static int saveReservClient (Client client) {

        int status = 0 ;
        try{
            Connection conn  = clientDB.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("insert into ps3.client (nom , prenom   , datenaissance, tel ,cin, addressemail,login,password ) values (?,?,?,?,?,?,?,?)") ;
           
            ps.setString(1,client.getNom());
            ps.setString(2,client.getPrenom());
            ps.setString(3,client.getDatenaissance()) ;
            ps.setString(4,client.getTel());
            ps.setString(5,client.getCin ());
            ps.setString(6,client.getAddressemail ());
            ps.setString(7,client.getLogin ());
            ps.setString(8,client.getPassword ());
            
           
          
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
      public static int modify ( Client c) {
        int status = 0 ;
        try{
            Connection conn  = clientDB.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement(" update  ps3.client set nom=?, prenom=?, datenaissance=?,tel=?,addressemail=?,login=?, password=? where cin=? ") ;
          
            ps.setString(1,c.getNom()) ;
            ps.setString(2,c.getPrenom()) ;
            ps.setString(3,c.getDatenaissance()) ;
            ps.setString(4,c.getTel()) ;
            ps.setString(5,c.getAddressemail());
            ps.setString(6,c.getLogin());
             ps.setString(7,c.getPassword()) ;
           ps.setString(9,c.getCin()) ;
             
           
           
           System.out.println(ps);
 
            status = ps.executeUpdate() ;
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
      
      public static int delete (String cin) {
 
        int status = 0 ;
        try{
            Connection conn  = Voyagedb.getConnexion() ;
            
             PreparedStatement ps= conn.prepareStatement("delete from ps3.client where cin=? ") ;
             
            ps.setString(1,cin);
            
            status = ps.executeUpdate() ; 
            conn.close();
            
        } catch(Exception e) {
            System.out.println(e) ;
        }
        return status ;
    }
      public static Client getClient(String CIN){
                Client client = new Client();

              
                try{
            Connection conn  = Voyagedb.getConnexion() ;
            PreparedStatement ps1= conn.prepareStatement("select * from client where cin= ? ") ;
            
            
          ps1.setString ( 1, CIN ) ;

             ResultSet rs1  = ps1.executeQuery() ;
                while ( rs1.next()) {
                  client.setNom(rs1.getString(1));
                  client.setPrenom(rs1.getString(2));
                  client.setDatenaissance(rs1.getString(3));
                  client.setTel(rs1.getString(4));
                  client.setCin(rs1.getString(5));
                  client.setAddressemail(rs1.getString(6));
                  client.setLogin(rs1.getString(7));
                  client.setPassword(rs1.getString(8));
      }
                        
             
               conn.close();

                }catch(Exception e) {
            System.out.println(e) ;
        }
                                System.out.print("kk");

                return client; 
  
    }
}
      
      /*
       public static List<User> getAllProduits () {
        List<User> list = new ArrayList<User>() ;
         try{
            Connection conn  = UserDb.getConnexion() ;
            PreparedStatement ps= conn.prepareStatement("select * from User") ;
             ResultSet rs  = ps.executeQuery() ;
             while ( rs.next()) {
                 User p= new User() ;
                 p.setId_user(rs.getInt(1));
                 p.setNom(rs.getString(2));
                 p.setPrenom(rs.getString(3));
                 p.setLogin(rs.getString(4));
                 p.setType(rs.getInt(6));
                 
                list.add(p) ;
                        
             }
               conn.close();

         }catch(Exception e) {
            System.out.println(e) ;
        }
        
        return list ;
        */
    