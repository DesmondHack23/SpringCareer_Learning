package br.com.treinaweb.teste.struts2.controllers.impl;

import br.com.treinaweb.teste.struts2.controllers.interfaces.Controller;
import br.com.treinaweb.teste.struts2.dao.impl.AlbumDAO;
import br.com.treinaweb.teste.struts2.models.Album;

public class AlbumController extends Controller<Album, Integer> {
	// Generic Parameter

	public AlbumController() {
		// Liskov Substitution Principle(LSP)
		super(new AlbumDAO());
	}

	@Override
	public String listar() {
		try {
			this.setModelos(this.dao.todos());
			return SUCCESS;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return ERROR;
		}
	}

	@Override
	public String detalhar() {
		try {
			this.setModelo(dao.porId(this.getId()));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}

	@Override
	public String inserir() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletar() {
		// TODO Auto-generated method stub
		return null;
	}

}
