/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;



/**
 *
 * @author BENADADA Noema
 */
public class reservation {
  public String id;
    public String cinc;
    public String datereserv;
    public String heurereserv;

    public String numvoyage;

    public reservation(String id, String cinc, String datereserv, String heurereserv, String numvoyage) {
        this.id = id;
        this.cinc = cinc;
        this.datereserv = datereserv;
        this.heurereserv = heurereserv;
        this.numvoyage = numvoyage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    public String getNumvoyage() {
        return numvoyage;
    }

    public void setNumvoyage(String numvoyage) {
        this.numvoyage = numvoyage;
    }

    
  

    public String getCinc() {
        return cinc;
    }

    public void setCinc(String cinc) {
        this.cinc = cinc;
    }

    public String getDatereserv() {
        return datereserv;
    }

    public void setDatereserv(String datereserv) {
        this.datereserv = datereserv;
    }

    public String getHeurereserv() {
        return heurereserv;
    }

    public void setHeurereserv(String heurereserv) {
        this.heurereserv = heurereserv;
    }

  
    
    
    


}
