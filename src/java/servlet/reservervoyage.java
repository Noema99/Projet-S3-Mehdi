/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

/**
 *
 * @author hp i5
 */
import models.reservation;
import dao.Reservationbd;
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

import models.voiture;
@WebServlet(name = "reservervoyage", urlPatterns = {"/reservervoyage"})

public class reservervoyage extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
     
            
                String id = random();
                  System.out.print(id);
             String cinc =  request.getParameter("cinc") ;
               System.out.print(cinc);
             String datereserv =  request.getParameter("datereserv") ;
               System.out.print(datereserv);
             String heurereserv =  request.getParameter("heurereserv") ;
               System.out.print(heurereserv);
             String numvoyage =  request.getParameter("numvoyage") ;
               System.out.print(numvoyage);
             String voiture =request.getParameter("numvoiture");
            System.out.print(voiture);
           
             reservation r =new reservation(id,cinc,datereserv,heurereserv,numvoyage);

             Reservationbd.saveReservation(r);
                                     

            String numtrain= Voyagedb.getnumTrain(numvoyage);
            String numvoiture="b";
            if(voiture.equals("voiture1")){
                            numvoiture= Traindb.getnumVoiture1(numtrain, voiture);

            } else if (voiture.equals("voiture2")){
                             numvoiture= Traindb.getnumVoiture2(numtrain, voiture);

            } else if (voiture.equals("voiture3")){
                             numvoiture= Traindb.getnumVoiture3(numtrain, voiture);

            }
            else if (voiture.equals("voiture4")){
                             numvoiture= Traindb.getnumVoiture4(numtrain, voiture);

            }
            else if (voiture.equals("voiture5")){
                             numvoiture= Traindb.getnumVoiture5(numtrain, voiture);

            }
            else if (voiture.equals("voiture6")){
                             numvoiture= Traindb.getnumVoiture6(numtrain, voiture);

            }else if (voiture.equals("voiture7")){
                             numvoiture= Traindb.getnumVoiture7(numtrain, voiture);

            }
            else if (voiture.equals("voiture8")){
                             numvoiture= Traindb.getnumVoiture8(numtrain, voiture);

            }
                                     System.out.print(numvoiture);
                         voiture Voiture = Voiturebd.getplaces(numvoiture);
                         
                          System.out.print(Voiture.getNumvoiture());
                         System.out.print(Voiture.getplace1());
                         request.setAttribute("CIN", cinc);
                         request.setAttribute("numtrain", numtrain);
                         request.setAttribute("voitura", voiture);//voitur1 exemple
          request.setAttribute("numvoiture", Voiture.getNumvoiture());//random
request.setAttribute("voiture", Voiture);
                         System.out.print("mm");

             System.out.print(numtrain);
            request.getRequestDispatcher("place.jsp").include(request, response);
            
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

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
