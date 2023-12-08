package web;

import domain.Persona;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import servicio.ServicioPersona;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioPersona servicioPersona = new ServicioPersona();
        
        List<Persona> personas = servicioPersona.listarPersonas();
        
        request.setAttribute("personas", personas);
        
        try {
            request.getRequestDispatcher("/WEB-INF/listarPersonas.jsp").forward(request, response);
        } catch (Exception ex) {
           ex.printStackTrace(System.out);
        }
    }
}