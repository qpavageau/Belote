package DAO.Factory;

import pojos.*;

public abstract class BeloteDAOFactory {
    
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Carte> getDAOCarte() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Equipe> getDAOEquipe() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Joueur> getDAOJoueur() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<MainJ> getDAOMainJ() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Manche> getDAOManche() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Paquet> getDAOPaquet() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Partie> getDAOPartie() throws DAOException;
    /**
     * @return le DAO pour la classe/table Sport
     * @throws DAOException en cas de problème
     */
    public abstract DAO<Pli> getDAOPli() throws DAOException;

}
