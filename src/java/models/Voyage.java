/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;



/**
 *
 * @author hp i5
 */
public class Voyage {
    public String labelVoyage;
    public String montant;

    public String gareDepart;
    public String gareArrivee;
    public String dateDepart;
    public String dateArrivee;
    public String duree;
    public String numtrain;

    public Voyage(String labelVoyage, String montant, String gareDepart, String gareArrivee, String dateDepart, String dateArrivee, String duree, String numtrain) {
        this.labelVoyage = labelVoyage;
        this.montant = montant;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.duree = duree;
        this.numtrain = numtrain;
    }
    
    


    public String getNumtrain() {
        return numtrain;
    }

    public void setNumtrain(String numtrain) {
        this.numtrain = numtrain;
    }

    public Voyage() {
    }

    public String getLabelVoyage() {
        return labelVoyage;
    }

    public void setLabelVoyage(String labelVoyage) {
        this.labelVoyage = labelVoyage;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

   
    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(String gareDepart) {
        this.gareDepart = gareDepart;
    }

    public String getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(String gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

 

    
    }

