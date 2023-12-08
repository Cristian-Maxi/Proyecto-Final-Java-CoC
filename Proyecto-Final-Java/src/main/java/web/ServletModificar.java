package web;

import domain.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import servicio.ServicioPersona;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idPersonaS = request.getParameter("idPersona");
        Integer idPersona = Integer.parseInt(idPersonaS);
        
        Persona persona = new Persona();
        persona.setId_persona(idPersona);
        
        ServicioPersona servicioPersona = new ServicioPersona();
        persona = servicioPersona.encontrarPersonas(persona);
        
        //request.setAttribute("persona", persona);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("persona", persona);
        
        request.getRequestDispatcher("/WEB-INF/modificarPersona.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String modificar = request.getParameter("Modificar");
        
        ServicioPersona servicioPersona = new ServicioPersona();
        
        if(modificar != null) {     
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String cantidad_personas = request.getParameter("cantidad_personas");
        
        HttpSession sesion = request.getSession();
        Persona persona = (Persona) sesion.getAttribute("persona");
        
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEmail(email);
        persona.setCantidad_personas(cantidad_personas);
              
        servicioPersona.guardarPersonas(persona);
        
        sesion.removeAttribute("persona");
    
        } else {
            //Caso de Eliminar
            String idPersonaS = request.getParameter("idPersona");
            Integer idPersona = Integer.parseInt(idPersonaS);
            Persona persona = new Persona(idPersona);
            servicioPersona.eliminarPersonas(persona);
        }
        
        response.sendRedirect(request.getContextPath() + "/ServletControlador");

    }
}

