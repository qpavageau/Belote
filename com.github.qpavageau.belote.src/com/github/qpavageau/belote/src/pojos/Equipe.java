package com.github.qpavageau.belote.src.pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Equipe {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="_id")
    private int idEquipe;
	private String Nom;
	private int Score;
	private int nbPlisGagnes;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "equipe") //OneToMany(EquipeToJoueur), INVERSE de ManyToOne(JoueurToEquipe)
	private Set<Joueur>joueurs; 
	@ManyToOne @JoinColumn(name="_idPartie", nullable =false)
	private Partie partie;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "equipe")
	private Set<Pli>plis;
	
	public Equipe() {
		this("unknown", 0,0);
	}
	
	public Equipe(String Nom, int Score, int nbPlisGagnes) {
		this.set_Nom( Nom );
		this.set_Score( Score );
		this.set_nbPlisGagnes( nbPlisGagnes);
	}
	
	public int get_idEquipe() {
		return idEquipe;
	}
	
	public String get_Nom() {
		return Nom;
	}
	
	public int get_Score() {
		return Score;
	}
	
	public int get_nbPlisGagnes() {
		return nbPlisGagnes;
	}
	
	public void set_Nom(String Nom) {
		this.Nom = Nom;
	}
	
	public void set_Score(int Score) {
		this.Score = Score;
	}
	
	public void set_nbPlisGagnes(int nbPlisGagnes) {
		this.nbPlisGagnes = nbPlisGagnes;
	}

	@Override
	public String toString() {
		return "Equipe [idEquipe=" + idEquipe + ", Nom=" + Nom + ", Score=" + Score + ", nbPlisGagnes=" + nbPlisGagnes
				+ ", partie=" + partie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		result = prime * result + Score;
		result = prime * result + idEquipe;
		result = prime * result + ((joueurs == null) ? 0 : joueurs.hashCode());
		result = prime * result + nbPlisGagnes;
		result = prime * result + ((partie == null) ? 0 : partie.hashCode());
		result = prime * result + ((plis == null) ? 0 : plis.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipe other = (Equipe) obj;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (Score != other.Score)
			return false;
		if (idEquipe != other.idEquipe)
			return false;
		if (joueurs == null) {
			if (other.joueurs != null)
				return false;
		} else if (!joueurs.equals(other.joueurs))
			return false;
		if (nbPlisGagnes != other.nbPlisGagnes)
			return false;
		if (partie == null) {
			if (other.partie != null)
				return false;
		} else if (!partie.equals(other.partie))
			return false;
		if (plis == null) {
			if (other.plis != null)
				return false;
		} else if (!plis.equals(other.plis))
			return false;
		return true;
	}
	
}
