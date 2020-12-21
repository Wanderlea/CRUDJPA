package br.com.jpahibernate.testes;

import br.com.jpahibernate.model.bean.Categoria;
import br.com.jpahibernate.model.bean.Produto;
import br.com.jpahibernate.model.dao.ProdutoDao;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		ProdutoDao dao = new ProdutoDao();
		
		/*Categoria categoria = new Categoria();
		categoria.setId(3);
		Produto produto = new Produto();
		produto.setId(7);
		produto.setDescricao("Arroz Arborio");
		produto.setQtd(11);
		produto.setValor(5.50);
		produto.setCategoria(categoria);
		dao.save(produto);*/
		
		//Produto produto = dao.findById(7);
		
		for (Produto produto : dao.findAll()) {
			System.out.println(produto);
		}
	}

}
