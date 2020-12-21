package br.com.jpahibernate.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {

	// Paramêtro persistence-unit do persistence.xml
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_HIBERNATE");
	
	public EntityManager getConnection(){
		return emf.createEntityManager();
	}

}
