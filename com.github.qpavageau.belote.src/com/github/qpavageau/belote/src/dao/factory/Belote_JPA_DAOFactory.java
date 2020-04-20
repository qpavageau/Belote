package com.github.qpavageau.belote.src.dao.factory;

import com.github.qpavageau.belote.src.dao.implementation.*;
import com.github.qpavageau.belote.src.pojos.*;
/**
 * Fabrique concrète de DAO pour le schéma relationnel Belote avec une implémentation en JPA.
 * @author Quentin
 */
public class Belote_JPA_DAOFactory extends BeloteDAOFactory {
	
	private JPA_CarteDAO daoCarte = null;
    private JPA_EquipeDAO daoEquipe = null;
    private JPA_JoueurDAO daoJoueur = null;
    private JPA_MainJDAO daoMainJ = null;
    private JPA_MancheDAO daoManche = null;
    private JPA_PaquetDAO daoPaquet = null;
    private JPA_PartieDAO daoPartie = null;
    private JPA_PliDAO daoPli = null;

	@Override
	public DAO<Carte> getDAOCarte() throws DAOException {
        if (daoCarte == null) daoCarte = new JPA_CarteDAO();
        return daoCarte;
	}

	@Override
	public DAO<Equipe> getDAOEquipe() throws DAOException {
        if (daoEquipe == null) daoEquipe = new JPA_EquipeDAO();
        return daoEquipe;
	}

	@Override
	public DAO<Joueur> getDAOJoueur() throws DAOException {
        if (daoJoueur == null) daoJoueur = new JPA_JoueurDAO();
        return daoJoueur;
	}

	@Override
	public DAO<MainJ> getDAOMainJ() throws DAOException {
        if (daoMainJ == null) daoMainJ = new JPA_MainJDAO();
        return daoMainJ;
	}

	@Override
	public DAO<Manche> getDAOManche() throws DAOException {
        if (daoManche == null) daoManche = new JPA_MancheDAO();
        return daoManche;
	}

	@Override
	public DAO<Paquet> getDAOPaquet() throws DAOException {
        if (daoPaquet == null) daoPaquet = new JPA_PaquetDAO();
        return daoPaquet;
	}

	@Override
	public DAO<Partie> getDAOPartie() throws DAOException {
        if (daoPartie == null) daoPartie = new JPA_PartieDAO();
        return daoPartie;
	}

	@Override
	public DAO<Pli> getDAOPli() throws DAOException {
        if (daoPli == null) daoPli = new JPA_PliDAO();
        return daoPli;
	}
}
