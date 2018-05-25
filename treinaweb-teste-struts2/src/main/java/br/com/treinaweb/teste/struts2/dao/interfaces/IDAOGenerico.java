package br.com.treinaweb.teste.struts2.dao.interfaces;

import java.util.List;

public interface IDAOGenerico<M, K> {
	/*
	 * Session is the Connection with DB
	 * Session factory is the component response to open the connection 
	 */
	List<M> todos();
	M porId(K id);
	void inserir(M modelo);
	void atualizar(M modelo);
	void deletar(M modelo);

}
