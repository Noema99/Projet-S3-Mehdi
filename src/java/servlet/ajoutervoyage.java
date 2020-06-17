/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import dao.Traindb;
import dao.Voiturebd;

import dao.Voyagedb;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Voyage;
import models.train;
import models.trainessaie;
import models.voiture;


/**
 *
 * @author BENADADA Noema
 */
@WebServlet(name = "ajoutervoyage", urlPatterns = {"/ajoutervoyage"})
public class ajoutervoyage extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String labelVoyage =  request.getParameter("labelVoyage") ;
            System.out.println(labelVoyage);
            String montant = request.getParameter("montant");
            System.out.println(montant);
            String gareDepart = request.getParameter("gareDepart");
            System.out.println(gareDepart);
            String gareArrivee = request.getParameter("gareArrivee"); 
            System.out.println(gareArrivee);
            String dateDepart =  request.getParameter("dateDepart") ;
            System.out.println(dateDepart);
            
            String dateArrivee = request.getParameter("dateArrivee");
            System.out.println(dateArrivee);
            String duree = request.getParameter("duree");
            System.out.println(duree);
            String numtrain = request.getParameter("numtrain");
            System.out.println(numtrain);
        String voiture1 = random();
          String voiture2 = random();
          String voiture3 = random();
          String voiture4 = random();
          String voiture5 = random();
          String voiture6 = random();
          String voiture7 = random();
          String voiture8 = random();
        
           voiture Voiture1 = new voiture(voiture1);
       voiture Voiture2 = new voiture(voiture2);
       voiture Voiture3 = new voiture(voiture3);
       voiture Voiture4 = new voiture(voiture4);
       voiture Voiture5 = new voiture(voiture5);
       voiture Voiture6 = new voiture(voiture6);
       voiture Voiture7 = new voiture(voiture7);
       voiture Voiture8 = new voiture(voiture8);
       Voiturebd.saveReservationVoiture(Voiture1);
       Voiturebd.saveReservationVoiture(Voiture2);
       Voiturebd.saveReservationVoiture(Voiture3);
       Voiturebd.saveReservationVoiture(Voiture4);
       Voiturebd.saveReservationVoiture(Voiture5);
       Voiturebd.saveReservationVoiture(Voiture6);
       Voiturebd.saveReservationVoiture(Voiture7);
       Voiturebd.saveReservationVoiture(Voiture8);

          train t=new train(numtrain,voiture1,voiture2,voiture3,voiture4,voiture5,voiture6,voiture7,voiture8 );
           Traindb.save(t);
           Voyage v = new Voyage(labelVoyage,montant,gareDepart, gareArrivee, dateDepart,dateArrivee,duree,numtrain);
            Voyagedb.save(v);
    
            request.getRequestDispatcher("voyagesdispo.jsp").include(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    public String random() {
  
    int leftLimit = 97; // letter 'a'
    int rightLimit = 122; // letter 'z'
    int targetStringLength = 10;
    Random random = new Random();
    StringBuilder buffer = new StringBuilder(targetStringLength);
    for (int i = 0; i < targetStringLength; i++) {
        int randomLimitedInt = leftLimit + (int) 
          (random.nextFloat() * (rightLimit - leftLimit + 1));
        buffer.append((char) randomLimitedInt);
    }
    String generatedString = buffer.toString();
 
    System.out.println(generatedString);
    return generatedString;
}

}
