package web;

import domain.Persona;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import servicio.ServicioPersona;

@WebServlet("/ServletAgregar")
public class ServletAgregar extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String cantidad_personas = request.getParameter("cantidad_personas");

        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setEmail(email);
        persona.setCantidad_personas(cantidad_personas);

        ServicioPersona servicioPersona = new ServicioPersona();
        servicioPersona.guardarPersonas(persona);

        // Redireccionar a ServletControlador
        //request.getRequestDispatcher("/WEB-INF/listarPersonas.jsp").forward(request, response);;
        response.sendRedirect(request.getContextPath() + "/ServletControlador");

    }
}
