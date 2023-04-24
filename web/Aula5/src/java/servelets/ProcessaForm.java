
package servelets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcessaForm", urlPatterns = {"/ProcessaForm"})
public class ProcessaForm extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //recebendo parâmetro do formulário
        String data = request.getParameter("data");
        String idade = request.getParameter("idade");
        
        //Testando de parâmentro turno[] é nulo
        if(request.getParameterValues("turno[]")   != null){
        String turno[] = request.getParameterValues("turno[]");
           //"Varrendo" lista de turnos
           String turnos = "";
        for(int i=0; i<turno.length; i++){
            turnos += turno[i] + "<br>";
    } 
        String descricao = request.getParameter("descricao");
        
        
     
        }
                                  
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProcessaForm</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>"+ data +"</h1>");
            out.println("<h1>"+ idade +"</h1>");
            out.println("<h1>"+ turnos +"</h1>");
            out.println("<h1>"+ descricao +"</h1>");
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
