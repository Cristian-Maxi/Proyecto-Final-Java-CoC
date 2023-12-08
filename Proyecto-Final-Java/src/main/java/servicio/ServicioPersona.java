package servicio;

import dao.PersonaDao;
import domain.Persona;
import java.util.List;

public class ServicioPersona {

    private PersonaDao personaDao = new PersonaDao();

    public List<Persona> listarPersonas() {
        return personaDao.listar();
    }

    public void guardarPersonas(Persona persona) {
        if (persona != null && persona.getId_persona()== null) {
            personaDao.insertar(persona);
        } else {
            personaDao.actualizar(persona);
        }
    }

    public void eliminarPersonas(Persona persona) {
        personaDao.eliminar(persona);
    }

    public Persona encontrarPersonas(Persona persona) {
        return personaDao.buscarPorId(persona);
    }
}
