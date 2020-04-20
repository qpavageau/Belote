package pojos;

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
public class Manche {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column( name= "_id")
	private int idManche;
	private int nbplis;
	@ManyToOne @JoinColumn(name="_idPartie", nullable =false)
	private Partie partie;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "manche")
	private Set<Pli>plis;
	
	public Manche() {  					//Constructeur 0 paramètres
        this(0);
    }
      
    public Manche(int nbplis) {
        this.set_nbplis( nbplis );
    }
    
    //Getters & Setters
    public int get_nbplis() {
        return nbplis;
    }
 
    public void set_nbplis(int nbplis) {
        this.nbplis = nbplis;
    }

	@Override
	public String toString() {
		return "Manche [idManche=" + idManche + ", nbplis=" + nbplis + ", partie=" + partie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idManche;
		result = prime * result + nbplis;
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
		Manche other = (Manche) obj;
		if (idManche != other.idManche)
			return false;
		if (nbplis != other.nbplis)
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