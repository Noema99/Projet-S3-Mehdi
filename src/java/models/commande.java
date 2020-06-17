/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import static javafx.beans.binding.Bindings.length;

/**
 *
 * @author BENADADA Noema
 */
public class commande {
    public String nomRepas;
    public String qtite;
    public String PU;
    public String prixtotal;
    public String cinc;

    public commande(String nomRepas, String qtite, String PU, String prixtotal, String cinc) {
        this.nomRepas = nomRepas;
        this.qtite = qtite;
        this.PU = PU;
        this.prixtotal = prixtotal;
        this.cinc = cinc;
    }

    public String getNomRepas() {
        return nomRepas;
    }

    public void setNomRepas(String nomRepas) {
        this.nomRepas = nomRepas;
    }

    public String getQtite() {
        return qtite;
    }

    public void setQtite(String qtite) {
        this.qtite = qtite;
    }

    public String getPU() {
        return PU;
    }

    public void setPU(String PU) {
        this.PU = PU;
    }

    public String getPrixtotal() {
     
        return prixtotal;
    }

    public void setPrixtotal(String prixtotal) {
        this.prixtotal = prixtotal;
    }

    public String getCinc() {
        return cinc;
    }

    public void setCinc(String cinc) {
        this.cinc = cinc;
    }

    
    
    
    
}
