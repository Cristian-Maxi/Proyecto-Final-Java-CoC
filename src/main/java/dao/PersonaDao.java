package dao;

import domain.Persona;
import jakarta.persistence.Query;
import java.util.List;

public class PersonaDao extends GenericDao {

    public List<Persona> listar() {

        String consulta = "SELECT c FROM Persona c";
        em = getEntityManager();
        Query query = em.createQuery(consulta);
        return query.getResultList();
    }

    public void insertar(Persona persona) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(persona); // Aquí persistes la entidad en la base de datos
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void actualizar(Persona persona) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public void eliminar(Persona persona) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }

    public Persona buscarPorId(Persona persona) {
        em = getEntityManager();
        return em.find(Persona.class, persona.getId_persona());
    }
}
