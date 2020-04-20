package belote;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojos.Joueur;

public class MainOneToOne {

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
