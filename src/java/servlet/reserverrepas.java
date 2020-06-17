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
import dao.Commandebd;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.commande;
@WebServlet(name = "reserverrepas", urlPatterns = {"/reserverrepas"})

public class reserverrepas extends HttpServlet{
     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
             String numRepas =  request.getParameter("numRepas") ;
             String qtite =  request.getParameter("qtite") ;
             String PU =  request.getParameter("PU") ;
             String prixtotal =  request.getParameter("prixtotal") ;
             String cinc =  request.getParameter("cinc") ;
            
           commande c =new commande(numRepas,qtite,PU,prixtotal,cinc);
           Commandebd.saveCommande(c);

            request.getRequestDispatcher("payerreserv.jsp").include(request, response);
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
}
