package br.com.treinaweb.teste.struts2.controllers.interfaces;

import java.util.List;

//Generic Abstract Class
public abstract class IController<M> {
	
	// Redirecting Static property	
	public static String SUCCESS = "SUCCESS";
	public static String ERROR = "ERROR";
	
	// Access properties of the Heirs classes
	protected M modelo;
	protected List<M> modelos;

	public M getModelo() {
		return modelo;
	}

	public void setModelo(M modelo) {
		this.modelo = modelo;
	}

	public List<M> getModelos() {
		return modelos;
	}

	public void setModelos(List<M> modelos) {
		this.modelos = modelos;
	}
	
	

}
