package br.com.jpahibernate.testes;

import br.com.jpahibernate.model.bean.Categoria;
import br.com.jpahibernate.model.dao.CategoriaDao;

public class CategoriaTeste {
	
	public static void main(String[] args) {
		
		//Categoria c = new Categoria();
		//c.setDescricao("teste");
		
		CategoriaDao dao = new CategoriaDao();
		//dao.save(c);
		
		/*		
		for(Categoria c: dao.findAll()){
			System.out.println(c);
		}*/
		
		dao.remove(5);
	}

}
