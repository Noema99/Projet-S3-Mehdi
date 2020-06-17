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
public class ville {
    public String nom;
    public int nbregare;

    public ville(String nom, int nbregare) {
        this.nom = nom;
        this.nbregare = nbregare;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbregare() {
        return nbregare;
    }

    public void setNbregare(int nbregare) {
        this.nbregare = nbregare;
    }
    
    
    
}
