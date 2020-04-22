package com.github.qpavageau.belote.src.dao.launcher;

import java.util.List;

import com.github.qpavageau.belote.src.dao.factory.DAOException;
import com.github.qpavageau.belote.src.dao.implementation.JPA_CarteDAO;
import com.github.qpavageau.belote.src.pojos.Carte;

public class DAOLauncher {
    public static void main(String[] args) {
    	JPA_CarteDAO jpaCarteDao = null;
		try {
			jpaCarteDao = new JPA_CarteDAO();
		} catch (DAOException e) {
			e.printStackTrace();
		}
        List<Carte> cartes = jpaCarteDao.getAll();
        System.out.println();
        System.out.println("Liste des cartes JPA");
        for (Carte carte : cartes) {
            System.out.println(carte);
        }
    }
}
