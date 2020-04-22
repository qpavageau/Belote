package com.github.qpavageau.belote.src.dao.implementation;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.github.qpavageau.belote.src.dao.factory.DAO;
import com.github.qpavageau.belote.src.dao.factory.DAOException;
import com.github.qpavageau.belote.src.dao.factory.NoteEntityManager;
import com.github.qpavageau.belote.src.pojos.Carte;

public class JPA_CarteDAO implements DAO<Carte>{
	private EntityManager em = null;
	
	@Override
	public Carte find(int id) throws DAOException {
		String SQLRequest = "SELECT e FROM Carte e WHERE e._id = :_id";
		Query query = em.createQuery(SQLRequest);
		query.setParameter("_id", id);
		return null;
	}

	@Override
	public void create(Carte data) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Carte data) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Carte data) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carte> getAll() {
		String SQLRequest = "SELECT e FROM Carte e";
		Query query = em.createQuery(SQLRequest);
		List<Carte> cartes = query.getResultList();
		return cartes;
	}

	@Override
	public Optional<Carte> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public JPA_CarteDAO() throws DAOException {
		em = NoteEntityManager.getInstance().getEntityManager();
	}

	@Override
	public void DAO() throws DAOException {
		// TODO Auto-generated method stub
		
	}
} 
    