-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------

DROP DATABASE IF EXISTS Belote;
CREATE DATABASE Belote;
USE Belote;

-- -----------------------------------------------------------------------------
-- - Construction de la table des parties                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Partie (
	_id int UNIQUE,
	Nom varchar ( 20 ),
	PRIMARY KEY(_id) 
);
SELECT * FROM Partie;

-- -----------------------------------------------------------------------------
-- - Construction de la table des paquets                            ---
-- -----------------------------------------------------------------------------
CREATE TABLE Paquet (
	nb_cartes int,
	_id int UNIQUE,
	PRIMARY KEY(_id)
);
SELECT * FROM Paquet;

-- -----------------------------------------------------------------------------
-- - Construction de la table des mains                            ---
-- -----------------------------------------------------------------------------
CREATE TABLE Main (
	nb_cartes int,
	_id int UNIQUE,
	PRIMARY KEY(_id)
);
SELECT * FROM Main;

-- -----------------------------------------------------------------------------
-- - Construction de la table des manches                            ---
-- -----------------------------------------------------------------------------
CREATE TABLE Manche (
	_id int UNIQUE,
	nbPlis int,
	_idPartie` int,
	FOREIGN KEY(_idPartie) REFERENCES Partie(_id),
	PRIMARY KEY(_id)
);
SELECT * FROM Manche;

-- -----------------------------------------------------------------------------
-- - Construction de la table des equipes                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Equipe (
	_id int NOT NULL UNIQUE,
	Nom` varchar ( 20 ),
	Score int,
	nbPlisGagnes int,
	_idPartie int,
	PRIMARY KEY(_id),
	FOREIGN KEY(_idPartie) REFERENCES Partie(_id)
);
SELECT * FROM Equipe;

-- -----------------------------------------------------------------------------
-- - Construction de la table des plis                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Pli (
	_id int UNIQUE,
	Points int,
	_idManche int,
	_idEquipe int,
	FOREIGN KEY(_idEquipe) REFERENCES Equipe(_id),
	FOREIGN KEY(_idManche) REFERENCES Manche(_id),
	PRIMARY KEY(_id)
);
SELECT * FROM Pli;

-- -----------------------------------------------------------------------------
-- - Construction de la table des cartes                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Carte (
	Couleur varchar ( 20 ) NOT NULL,
	Valeur int,
	Nom varchar ( 20 ),
	Atout int,
	_id int NOT NULL UNIQUE,
	_idMain int,
	_idPaquet int,
	FOREIGN KEY(_idMain) REFERENCES Main(_id),
	PRIMARY KEY(_id),
	FOREIGN KEY(_idPaquet) REFERENCES Paquet(_id)
);

SELECT * FROM Carte;

-- -----------------------------------------------------------------------------
-- - Construction de la table des joueurs                            ---
-- -----------------------------------------------------------------------------

CREATE TABLE Joueur (
	_id int NOT NULL UNIQUE,
	Prenom varchar ( 20 ) NOT NULL,
	_idMain int,
	_idEquipe int,
	nbPartie int,
	nbVictoire int,
	nbMoyVictoire REAL,
	ScoreMoy int,
	PRIMARY KEY(_id),
	FOREIGN KEY(_idMain) REFERENCES Main(_id),
	FOREIGN KEY(_idEquipe) REFERENCES Equipe(_id)
);
SELECT * FROM Joueur;