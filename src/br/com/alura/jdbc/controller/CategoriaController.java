package br.com.alura.jdbc.controller;

import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

public class CategoriaController {

	CategoriaDAO categoriaDao;

	public CategoriaController() {
		this.categoriaDao = new CategoriaDAO(
				new ConnectionFactory().recuperarConexao());
	}

	public List<Categoria> listar() {
		return this.categoriaDao.listar();
	}
}
