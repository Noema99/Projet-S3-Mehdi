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
public class repas {
    public String nomR;
    public String quantite;
    public String prixunitaire;

    public String getNomR() {
        return nomR;
    }

    public void setNomR(String nomR) {
        this.nomR = nomR;
    }

    

    public String getQuantite() {
        return quantite;
    }

    public void setQuantite(String quantite) {
        this.quantite = quantite;
    }

    public String getPrixunitaire() {
        return prixunitaire;
    }

    public void setPrixunitaire(String prixunite) {
        this.prixunitaire = prixunite;
    }

    public repas(String nom, String quantite, String prixunitaire) {
        this.nomR = nom;
        this.quantite = quantite;
        this.prixunitaire = prixunitaire;
    }  
}
