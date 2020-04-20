package com.github.qpavageau.belote.src.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.github.qpavageau.belote.src.pojos.Joueur;

public class ManagerOneToOne {

	public static void main(String[] args) throws Exception{
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Projet_Belote");
            entityManager = entityManagerFactory.createEntityManager();
        
            //JoueurToMain
            Joueur joueur = entityManager.find(Joueur.class, 1);
            System.out.println(joueur);
            
        } finally {
        	if ( entityManager != null ) entityManager.close();
        	if ( entityManagerFactory != null ) entityManagerFactory.close();
          }
	}
}
