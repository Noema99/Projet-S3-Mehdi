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
import javax.servlet.http.HttpSession;
import javax.ws.rs.client.Client;



/**
 *
 * @author BENADADA Noema
 */
@WebServlet(name = "modifierUser", urlPatterns = {"/modifierUser"})
public class modifierUser extends HttpServlet {

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
           
            String nom = request.getParameter("nom");
            System.out.println(nom);
     
            String prenom = request.getParameter("prenom"); 
            System.out.println(prenom);
       
            String datenaissance =  request.getParameter("datenaissance") ;
            System.out.println(datenaissance);
            
            String tel = request.getParameter("tel");
            System.out.println(tel);
            
            
            String cin = request.getParameter("cin");
            System.out.println(cin);
            
            String addressemail =  request.getParameter("addressemail") ;
            System.out.println(addressemail);
            
            String login = request.getParameter("login");
            System.out.println(login);
            
            
            String password = request.getParameter("password");
            System.out.println(password);
            
       
         
                HttpSession session = request.getSession();
  session.setAttribute("nom", nom);
        session.setAttribute("prenom", prenom);
          session.setAttribute("datenaissance", datenaissance);
        session.setAttribute("tel", tel);
        session.setAttribute("cin", cin);
        session.setAttribute("addressemail", addressemail);
          session.setAttribute("login", login);
        session.setAttribute("password", password);
            Client c = new Client(nom,prenom,datenaissance,tel, cin,addressemail,login,password);
            clientDB.modify(c);
           
            out.println("Modification réussie");
            request.getRequestDispatcher("espaceclient.jsp").include(request, response);
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
