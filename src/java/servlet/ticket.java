/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.Voiturebd;
import dao.Voyagedb;
import dao.clientDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Client;
import models.Voyage;
import models.recu;

/**
 *
 * @author BENADADA Noema
 */
@WebServlet(name = "ticket", urlPatterns = {"/ticket"})
public class ticket extends HttpServlet {

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
                    System.out.print("zzzz");
            String place1= request.getParameter("place1");

           String place2= request.getParameter("place2");
            String place3= request.getParameter("place3");
            String place4= request.getParameter("place4");
            String place5= request.getParameter("place5");
            String place6= request.getParameter("place6");
            String place7= request.getParameter("place7");
            String place8= request.getParameter("place8");
            String place9= request.getParameter("place9");
            String place10= request.getParameter("place10");
            String place11= request.getParameter("place11");
            String place12= request.getParameter("place12");
            String place13= request.getParameter("place13");
            String place14= request.getParameter("place14");
            String place15= request.getParameter("place15");
            String place16= request.getParameter("place16");
            String place17= request.getParameter("place17");
            String place18= request.getParameter("place18");
            String place19= request.getParameter("place19");
            String place20= request.getParameter("place20");
            String place21= request.getParameter("place21");
            String place22= request.getParameter("place22");
            String place23= request.getParameter("place23");
            String place24= request.getParameter("place24");
            String numtrain= request.getParameter("numtrain");
            String numvoiture= request.getParameter("numvoiture");
            String codevoiture= request.getParameter("codevoiture");
            String CIN=request.getParameter("CIN");
                                System.out.print("zzzz");
System.out.print(place2);
            String place = "a";
 if (place3.equals("indispo")){
     place = "place3";
    Voiturebd.setPlace3(codevoiture);
}else if (place4.equals("indispo")){
     place = "place4";
    Voiturebd.setPlace4(codevoiture);
}else if (place5.equals("indispo")){
     place = "place5";
    Voiturebd.setPlace5(codevoiture);
}else if (place6.equals("indispo")){
     place = "place6";
    Voiturebd.setPlace6(codevoiture);
}else if (place7.equals("indispo")){
     place = "place7";
    Voiturebd.setPlace7(codevoiture);
}else if (place8.equals("indispo")){
     place = "place8";
    Voiturebd.setPlace8(codevoiture);
}else if (place9.equals("indispo")){
     place = "place9";
    Voiturebd.setPlace9(codevoiture);
}else if (place10.equals("indispo")){
     place = "place10";
    Voiturebd.setPlace10(codevoiture);
}else if (place11.equals("indispo")){
     place = "place11";
    Voiturebd.setPlace11(codevoiture);
}else if (place12.equals("indispo")){
     place = "place12";
    Voiturebd.setPlace12(codevoiture);
}else if (place13.equals("indispo")){
     place = "place13";
    Voiturebd.setPlace13(codevoiture);
}else if (place14.equals("indispo")){
     place = "place14";
    Voiturebd.setPlace14(codevoiture);
}else if (place15.equals("indispo")){
     place = "place15";
    Voiturebd.setPlace15(codevoiture);
}else if (place16.equals("indispo")){
     place = "place16";
    Voiturebd.setPlace16(codevoiture);
}else if (place17.equals("indispo")){
     place = "place17";
    Voiturebd.setPlace17(codevoiture);
}else if (place18.equals("indispo")){
     place = "place18";
    Voiturebd.setPlace18(codevoiture);
}else if (place19.equals("indispo")){
     place = "place19";
    Voiturebd.setPlace19(codevoiture);
}else if (place20.equals("indispo")){
     place = "place20";
    Voiturebd.setPlace20(codevoiture);
}else if (place21.equals("indispo")){
     place = "place21";
    Voiturebd.setPlace21(codevoiture);
}else if (place22.equals("indispo")){
     place = "place22";
    Voiturebd.setPlace22(codevoiture);
}else if (place23.equals("indispo")){
     place = "place23";
    Voiturebd.setPlace23(codevoiture);
}else if (place24.equals("indispo")){
     place = "place24";
    Voiturebd.setPlace24(codevoiture);
}
                    System.out.print("zllz");

Client client = clientDB.getClient(CIN);
String Nom =client.getNom();
System.out.print(Nom);

String Prenom=client.getPrenom();
Voyage voyage =Voyagedb.getVoyage(numtrain);
String numVoyage=voyage.getLabelVoyage();
String numTrain=voyage.getNumtrain();
String montant=voyage.getMontant();
System.out.print(montant);

String gareDepart=voyage.getGareDepart();
String gareArrivee=voyage.getGareArrivee();
String dateDepart=voyage.getDateDepart();
String dateArrivee=voyage.getDateArrivee();
String Duree=voyage.getDuree();
recu Recu = new recu(Nom, Prenom, numVoyage, numTrain, numvoiture, place, gareDepart, gareArrivee, dateDepart, dateArrivee, Duree, montant);
System.out.print(numvoiture);
request.setAttribute("Recu", Recu);
request.setAttribute("place", place);
request.setAttribute("numvoiture", numvoiture);
request.setAttribute("numtrain", numtrain);
        request.getRequestDispatcher("recupaiement.jsp").include(request, response);

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

}
