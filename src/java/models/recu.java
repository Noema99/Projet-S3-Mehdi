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
public class recu {
    String Nom ;
    String Prenom;
    String numVoyage;
    String numTrain;
    String numVoiture;
    String numPlace;
    String gareDepart;
    String gareArrivee;
    String heureDepart;
    String heureArrivee;
    String Duree;
    String Montant;

    public recu(String Nom, String Prenom, String numVoyage, String numTrain, String numVoiture, String numPlace, String gareDepart, String gareArrivee, String heureDepart, String heureArrivee, String Duree, String Montant) {
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.numVoyage = numVoyage;
        this.numTrain = numTrain;
        this.numVoiture = numVoiture;
        this.numPlace = numPlace;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.Duree = Duree;
        this.Montant = Montant;
    }
    

    public void setMontant(String Montant) {
        this.Montant = Montant;
    }

    public String getMontant() {
        return Montant;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public void setNumVoyage(String numVoyage) {
        this.numVoyage = numVoyage;
    }

    public void setNumTrain(String numTrain) {
        this.numTrain = numTrain;
    }

    public void setNumVoiture(String numVoiture) {
        this.numVoiture = numVoiture;
    }

    public void setNumPlace(String numPlace) {
        this.numPlace = numPlace;
    }

    public void setGareDepart(String gareDepart) {
        this.gareDepart = gareDepart;
    }

    public void setGareArrivee(String gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public void setDuree(String Duree) {
        this.Duree = Duree;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public String getNumVoyage() {
        return numVoyage;
    }

    public String getNumTrain() {
        return numTrain;
    }

    public String getNumVoiture() {
        return numVoiture;
    }

    public String getNumPlace() {
        return numPlace;
    }

    public String getGareDepart() {
        return gareDepart;
    }

    public String getGareArrivee() {
        return gareArrivee;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public String getDuree() {
        return Duree;
    }
    
}
