package belote;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pojos.Carte;

public class Main {

	public static void main(String[] args) throws Exception{
		EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
//        MainJ Main = new MainJ(8);
//        Paquet paquet = new Paquet(32);
        
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("Projet_Belote");
            entityManager = entityManagerFactory.createEntityManager();
        
            System.out.println( "- Lecture de toutes les cartes -----------" );
            
            List<Carte> cartes = entityManager.createQuery( "from Carte", Carte.class )
                                   .getResultList();
            for (Carte carte : cartes) {
                System.out.println( carte );
            }
            
//            System.out.println( "- Insertion d'une nouvelle carte ----------" );
//            
//            EntityTransaction trans = entityManager.getTransaction();
//            trans.begin();
//            
//            MainJ newMainJ = new MainJ(8);
//            entityManager.persist(newMainJ);
//            
//            Paquet paquet = new Paquet(32);
//            entityManager.persist(paquet);
//            
//            Carte newCarte = new Carte(5,"Pique", 14, "9",1, newMainJ,  paquet);
//            entityManager.persist( newCarte );
//            
//            trans.commit();
//            
//            List<Carte> results = entityManager.createQuery( "from Carte", Carte.class ).getResultList();
//            for (Carte carte : results) {
//            	System.out.println( carte );
//            }
            
        } finally {
        	if ( entityManager != null ) entityManager.close();
        	if ( entityManagerFactory != null ) entityManagerFactory.close();
          }

	}
}
