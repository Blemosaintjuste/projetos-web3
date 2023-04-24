/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "PedidoServ", urlPatterns = {"/PedidoServ"})
public class PedidoServ extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //capturar parametros enviado pelo formulário
        String produto = request.getParameter("produto");
        Float preco = Float.parseFloat(request.getParameter("preco"));
        int qtd = Integer.parseInt (request.getParameter("qtd"));
        
        // Criando regra de negócio
        float total = (qtd* preco);
        String desconto;
        float totalDesc;
        
        if (qtd > 2){
            desconto = "Desconto aplicado!";
            totalDesc = total -(total * 002f);     
        }else {
            desconto = "Sem desconto";
            totalDesc = total;
        }
        
        
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>::: Sistema WEB :::</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dados do pedido</h1>");
            out.println("<h3>Produto: "+ produto +"</h3>");
            out.println("<h3>Preço: R$ "+ String.format("%.2f", preco) +"</h3>");
            out.println("<h3>Qtd: "+ qtd +"</h3>");
            out.println("<h3>Total: R$ "+ String.format("%.2f", totalDesc)+"</h3>");
            out.println("<h3>"+ desconto +"</h3>");
            out.println("<link rel='stylesheet' href='style.css'>");
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
