package com.github.qpavageau.belote.src.manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.github.qpavageau.belote.src.pojos.Carte;
import com.github.qpavageau.belote.src.pojos.Equipe;
import com.github.qpavageau.belote.src.pojos.Joueur;
import com.github.qpavageau.belote.src.pojos.Manche;
import com.github.qpavageau.belote.src.pojos.Pli;

public class ManagerManyToOne {

	public static void main(String[] args) throws Exception{
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Projet_Belote");
            entityManager = entityManagerFactory.createEntityManager();
        
            //JoueursToEquipe
            Joueur joueur = entityManager.find(Joueur.class, 2);
            System.out.println(joueur);
            
            //CartesToPaquet
            Carte carte = entityManager.find(Carte.class, 30);
            System.out.println(carte);
            
            
            //EquipeToPartie
            Equipe equipe = entityManager.find(Equipe.class, 2);
            System.out.println(equipe);
            
            //MancheTopartie
            Manche manche = entityManager.find(Manche.class, 1);
            System.out.println(manche);
            
            //PliToManche
            Pli pli = entityManager.find(Pli.class, 2);
            System.out.println(pli);
         
        } finally {
        	if ( entityManager != null ) entityManager.close();
        	if ( entityManagerFactory != null ) entityManagerFactory.close();
          }
	}
}
