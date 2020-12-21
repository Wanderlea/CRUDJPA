package br.com.jpahibernate.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.jpahibernate.connection.ConnectionFactory;
import br.com.jpahibernate.model.bean.Categoria;

public class CategoriaDao {

	public Categoria save(Categoria categoria) {

		EntityManager em = new ConnectionFactory().getConnection();

		try {
			em.getTransaction().begin();
			//save
			if(categoria.getId() == null){
				em.persist(categoria);
			//Update	
			}else{
				em.merge(categoria);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e);	
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
		
		return categoria;
	}
	
	
	public Categoria findById(Integer id){
		
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria categoria = null;
		
		try {
			categoria = em.find(Categoria.class, id);
		} catch (Exception e) {
			System.err.println(e);			
		}finally {
			em.close();
		}
		
		return categoria;
		
	}
	
	public List<Categoria> findAll(){
		
		EntityManager em = new ConnectionFactory().getConnection();
		List<Categoria> categorias = null;
		
		try {
			
			categorias = em.createQuery("from Categoria c").getResultList();
			
		} catch (Exception e) {
			System.err.println(e);			
		}finally {
			em.close();
		}
		
		return categorias;
	}
	
	public Categoria remove(Integer id){
		
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria categoria = null;
		
		try {
			categoria = em.find(Categoria.class, id);
			em.getTransaction().begin();
			em.remove(categoria);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			System.err.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return categoria;
		
	}

}
