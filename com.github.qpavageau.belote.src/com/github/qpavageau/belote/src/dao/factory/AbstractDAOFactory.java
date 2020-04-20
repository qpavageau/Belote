package com.github.qpavageau.belote.src.dao.factory;

public class AbstractDAOFactory {

    public static BeloteDAOFactory getDAOFactory(PersistenceKind type) {
        if (type.equals(PersistenceKind.JPA)) {
            return new Belote_JPA_DAOFactory();
        } else {
            return null;
        }
    }
}
