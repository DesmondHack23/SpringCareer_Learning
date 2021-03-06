package br.com.treinaweb.teste.struts2.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALB_ALBUNS") /* trimaga��o para indentifica��o */
public class Album implements Serializable {

	/*
	 * � recomendado pelo padr�o POJO que seja implementado a serializa��o nas
	 * classes
	 */

	private static final long serialVersionUID = -1327114278435446441L;

	/* Persistencia */
	@Id
	@GeneratedValue
	@Column(name = " ALB_ID")
	private int id;

	@Column(name = "ALB_NOME")
	private String nome;

	@Column(name = "ALB_ANO_LANCAMENTO")
	private int ano;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

}
