/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import dao.clientDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Client;


/**
 *
 * @author Elfinou
 */
@WebServlet(name = "AjouterUser", urlPatterns = {"/AjouterUser"})
public class AjouterUser extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String nom =  request.getParameter("nom") ;
            String prenom  =  request.getParameter("prenom") ;
            String datenaissance =  request.getParameter("datenaissance");
            String tel  =  request.getParameter("tel") ;
            String cin  =  request.getParameter("cin") ;
            String addressemail  =  request.getParameter("addressemail") ;
              String login  =  request.getParameter("login") ;
            String password  =  request.getParameter("password") ;
              out.println(login);
             Client client = new Client(nom,prenom,datenaissance,tel,cin,addressemail,login,password) ;
            clientDB.save(client);
            out.println(client);
            request.getRequestDispatcher("espaceclientadmin.jsp").include(request, response);
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    
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

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
