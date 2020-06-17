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
public class paiement {
    public String operateur;
        public String num;
            public String montanttotal;

    public paiement(String operateur, String num, String montanttotal) {
        this.operateur = operateur;
        this.num = num;
        this.montanttotal = montanttotal;
    }

    public String getOperateur() {
        return operateur;
    }

    public void setOperateur(String operateur) {
        this.operateur = operateur;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getMontanttotal() {
        return montanttotal;
    }

    public void setMontanttotal(String montanttotal) {
        this.montanttotal = montanttotal;
    }
            
            
    
}
