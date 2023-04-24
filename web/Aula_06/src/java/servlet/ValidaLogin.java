/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author QI
 */
@WebServlet(urlPatterns = {"/ValidaLoging"})
public class ValidaLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String user;
        String pass;
        if(request.getParameter("user").isEmpty()){
            user = "USUARIO NÃO INFORMADO";
        }else {
                user = request.getParameter("user");
        }
        if(request.getParameter("pass").isEmpty()){
            pass = "USUARIO NÃO INFORMADO";
        }else {
                pass = request.getParameter("pass");
        }
        
        String userDb = "oioi";
        String passDb = "você";
        
        if(user.equals(userDb)&& pass.equals(passDb)){
            request.getRequestDispatcher("inicio.jsp").forward(request,response);  
        }else{
              PrintWriter saida = response.getWriter();
              saida.print("<script>"
              + "alert('Acesso negado!');"
              + "history.back(-1));"
              + "<script>"        
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidaLoging</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ValidaLoging at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
