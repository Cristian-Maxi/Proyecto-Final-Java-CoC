package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public abstract class GenericDao {
    protected static EntityManager em;
    private static EntityManagerFactory emf;
    private static final String PR = "ProyectJava";
    
    public GenericDao() {
        if(em == null) {
            emf = Persistence.createEntityManagerFactory(PR);
        }
    }

    public static EntityManager getEntityManager() {
        if(em == null) {
            em = emf.createEntityManager();
        }
        return em;
    }
    
}
