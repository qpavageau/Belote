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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity @Table(name="Main")
public class MainJ {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column( name= "_id")
	private int idMainJ;
	@Column(name="nb_cartes")
	private int nbCartes;
	@OneToOne(mappedBy = "MainJ")
	private Joueur joueur; 
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "Main") //OneToMany(MainToCarte), INVERSE de ManyToOne(CarteToMain)
	private Set<Carte>cartes;
	
	public MainJ() {  					//Constructeur 0 paramètres
        this(0);
    }
      
    public MainJ(int nbCartes) {
        this.set_nbCartes( nbCartes );
    }
    
    //Getters & Setters
    public int get_nbCartes() {
        return nbCartes;
    }
    
    public int get_idMainJ() {
        return idMainJ;
    }
 
    public void set_nbCartes(int nbCartes) {
        this.nbCartes = nbCartes;
    }
    
    public void set_idMainJ(int idMainJ) {
        this.idMainJ = idMainJ;
    }

	@Override
	public String toString() {
		return "MainJ [idMainJ=" + idMainJ + ", nbCartes=" + nbCartes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartes == null) ? 0 : cartes.hashCode());
		result = prime * result + idMainJ;
		result = prime * result + ((joueur == null) ? 0 : joueur.hashCode());
		result = prime * result + nbCartes;
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
		MainJ other = (MainJ) obj;
		if (cartes == null) {
			if (other.cartes != null)
				return false;
		} else if (!cartes.equals(other.cartes))
			return false;
		if (idMainJ != other.idMainJ)
			return false;
		if (joueur == null) {
			if (other.joueur != null)
				return false;
		} else if (!joueur.equals(other.joueur))
			return false;
		if (nbCartes != other.nbCartes)
			return false;
		return true;
	}


}