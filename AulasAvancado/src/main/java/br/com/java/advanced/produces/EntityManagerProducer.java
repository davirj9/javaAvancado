package br.com.java.advanced.produces;

import java.io.Serializable;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Davi Maçana
 *
 */
@Named
public class EntityManagerProducer implements Serializable {

	private static final long serialVersionUID = 1L;
    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistenceUnit");

    @Produces
    public EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public void close(@Disposes EntityManager em) {
        if (em.isOpen()) {
            em.close();
        }
    }

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public static void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		EntityManagerProducer.entityManagerFactory = entityManagerFactory;
	}
}
