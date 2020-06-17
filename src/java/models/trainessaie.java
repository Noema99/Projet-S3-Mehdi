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
public class trainessaie{
   
public String numtrain;
public String numvoiture;

    public String getNumtrain() {
        return numtrain;
    }

    public void setNumtrain(String numtrain) {
        this.numtrain = numtrain;
    }

    public String getNumvoiture() {
        return numvoiture;
    }

    public void setNumvoiture(String numvoiture) {
        this.numvoiture = numvoiture;
    }

    public trainessaie(String numtrain, String numvoiture) {
        this.numtrain = numtrain;
        this.numvoiture = numvoiture;
    }

    public trainessaie(String numtrain) {
        this.numtrain = numtrain;
    }

      

    
    
}
