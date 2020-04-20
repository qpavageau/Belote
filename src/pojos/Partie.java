package pojos;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Partie {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column( name= "_id")
	private int idPartie;
	private String Nom;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "partie") //OneToMany(PartieToEquipe), INVERSE de ManyToOne(EquipeTopartie)
	private Set<Equipe>equipes;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "partie") //OneToMany(PartieToEquipe), INVERSE de ManyToOne(EquipeTopartie)
	private Set<Manche>manches;
	
	public Partie() {  					//Constructeur 0 paramètres
        this("unknown");
    }
      
    public Partie(String Nom) {
        this.set_Nom( Nom );
    }
    
    //Getters & Setters
    public String get_Nom() {
        return Nom;
    }
 
    public void set_Nom(String Nom) {
        this.Nom = Nom;
    }

	@Override
	public String toString() {
		return "Partie [idPartie=" + idPartie + ", Nom=" + Nom + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		result = prime * result + ((equipes == null) ? 0 : equipes.hashCode());
		result = prime * result + idPartie;
		result = prime * result + ((manches == null) ? 0 : manches.hashCode());
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
		Partie other = (Partie) obj;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (equipes == null) {
			if (other.equipes != null)
				return false;
		} else if (!equipes.equals(other.equipes))
			return false;
		if (idPartie != other.idPartie)
			return false;
		if (manches == null) {
			if (other.manches != null)
				return false;
		} else if (!manches.equals(other.manches))
			return false;
		return true;
	}

}