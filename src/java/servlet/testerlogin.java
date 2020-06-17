/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;


import dao.Adminbd;
import dao.Serveurbd;
import dao.Utilisateurbd;
import dao.clientDB;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Utilisateur;

/**
 *
 * @author BENADADA Noema
 */
@WebServlet(name = "testerlogin", urlPatterns = {"/testerlogin"})
public class testerlogin extends HttpServlet {

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
            
            String login  =  request.getParameter("login") ;
            String password  =  request.getParameter("password") ;
           
            
             
       
            //user
            int res = clientDB.testclient(login,password) ;
            
          //gerant
            int rs1= Adminbd.testadmin(login,password);out.println(rs1);
            //serveur
             int rs2= Serveurbd.testserveur(login,password);out.println(rs2);
           // if it is a user
            
           if(res!=-1){
               
             HttpSession session = request.getSession();

        session.setAttribute("login", login);
        session.setAttribute("password", password);
            request.getRequestDispatcher("espaceclient.jsp").include(request, response);
           }
           // si c l'admin
           else if(rs1!=-1){
               System.out.println("admin");
               request.getRequestDispatcher("admin.jsp").include(request, response);
           }
           // si c le serveur
            else if(rs2!=-1){
               System.out.println("serveur");
               request.getRequestDispatcher("serveur.jsp").include(request, response);
           }
           // if not
           else
               request.getRequestDispatcher("fail.jsp").forward(request, response);

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

