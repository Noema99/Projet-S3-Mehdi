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
public class Client {
    public String nom;
    public String prenom;
    public String datenaissance;
    public String tel;
    public String cin;
    public String addressemail;
    public String login;
    public String password;

    public Client(String cin) {
        this.cin = cin;
    }
    public Client(){
        
    }

    
    public Client(String nom, String prenom, String datenaissance, String tel, String cin, String addressemail, String login, String password) {
        this.nom = nom;
        this.prenom = prenom;
        this.datenaissance = datenaissance;
        this.tel = tel;
        this.cin = cin;
        this.addressemail = addressemail;
        this.login = login;
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAddressemail() {
        return addressemail;
    }

    public void setAddressemail(String addressemail) {
        this.addressemail = addressemail;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
   
   
    
        
    
}
