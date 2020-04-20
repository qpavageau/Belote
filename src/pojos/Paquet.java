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
public class Paquet {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="_id")
    private int idPaquet;
	@Column(name="nb_cartes")
	private int nbCartes;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "paquet") //OneToMany(PaquetToCarte), INVERSE de ManyToOne(CarteToPaquet)
	private Set<Carte>cartes; 
	public Paquet() {  					//Constructeur 0 paramètres
        this(0);
    }
    
    
    public Paquet(int nbCartes) {
        this.set_nbCartes( nbCartes );
    }
    
    //Getters & Setters
    public int get_idPaquet() {
        return idPaquet;
    }
        
    public int get_nbCartes() {
        return nbCartes;
    }

    public void set_nbCartes(int nbCartes) {
        this.nbCartes = nbCartes;
    }
    
    public void set_idPaquet(int idPaquet) {
        this.idPaquet = idPaquet;
    }

    
	@Override
	public String toString() {
		return "Paquet [idPaquet=" + idPaquet + ", nbCartes=" + nbCartes + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cartes == null) ? 0 : cartes.hashCode());
		result = prime * result + idPaquet;
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
		Paquet other = (Paquet) obj;
		if (cartes == null) {
			if (other.cartes != null)
				return false;
		} else if (!cartes.equals(other.cartes))
			return false;
		if (idPaquet != other.idPaquet)
			return false;
		if (nbCartes != other.nbCartes)
			return false;
		return true;
	}
	
}

    