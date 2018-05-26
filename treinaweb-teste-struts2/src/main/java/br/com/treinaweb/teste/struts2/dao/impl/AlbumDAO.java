package br.com.treinaweb.teste.struts2.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import br.com.treinaweb.teste.struts2.dao.interfaces.IDAOGenerico;
import br.com.treinaweb.teste.struts2.hibernate.utils.HibernateSessionFactoryUtils;
import br.com.treinaweb.teste.struts2.models.Album;

public class AlbumDAO implements IDAOGenerico<Album, Integer> {

	@SuppressWarnings("unchecked") // Ignore cache unchecked
	@Override
	public List<Album> todos() {
		// Session Factory to Connection for Listing
		List<Album> albuns = null;
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		albuns = (List<Album>) session.createQuery("from Album").list();
		session.close();
		return albuns;
	}

	@Override
	public Album porId(Integer id) {
		// Return searching for ID
		Album album = null;
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		album = session.get(Album.class, id);
		session.close();
		return album;
	}

	@Override
	public void inserir(Album modelo) {
		// Insert data in the DB
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		session.save(modelo);
		session.close();

	}

	@Override
	public void atualizar(Album modelo) {
		// Update data in the DB
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		session.update(modelo);
		session.close();

	}

	@Override
	public void deletar(Album modelo) {
		// Delete data in the DB host
		SessionFactory sf = HibernateSessionFactoryUtils.getSessionFactory();
		Session session = sf.openSession();
		session.delete(modelo);
		session.close();

	}

}
