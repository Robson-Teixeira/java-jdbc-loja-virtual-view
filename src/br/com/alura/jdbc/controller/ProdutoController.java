package br.com.alura.jdbc.controller;

import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoController {
	
	ProdutoDAO produtoDao;
	
	public ProdutoController() {
		this.produtoDao = new ProdutoDAO(
				new ConnectionFactory().recuperarConexao());
	}

	public void deletar(Integer id) {
		this.produtoDao.deletar(id);
	}

	public void salvar(Produto produto) {
		this.produtoDao.salvar(produto);
	}

	public List<Produto> listar() {
		return this.produtoDao.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDao.alterar(nome, descricao, id);
	}
}
