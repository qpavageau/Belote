package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pli {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column( name= "_id")
	private int idPli;
	private int Points;
	@ManyToOne @JoinColumn(name="_idManche", nullable =false)
	private Manche manche;
	@ManyToOne @JoinColumn(name="_idEquipe", nullable =false)
	private Equipe equipe;
	
	public Pli() {  					//Constructeur 0 paramètres
        this(0);
    }
      
    public Pli(int Points) {
        this.set_Points( Points );
    }
    
    //Getters & Setters
    public int get_Points() {
        return Points;
    }
 
    public void set_Points(int Points) {
        this.Points = Points;
    }

	@Override
	public String toString() {
		return "Pli [idPli=" + idPli + ", Points=" + Points + ", manche=" + manche + ", equipe=" + equipe + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Points;
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + idPli;
		result = prime * result + ((manche == null) ? 0 : manche.hashCode());
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
		Pli other = (Pli) obj;
		if (Points != other.Points)
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (idPli != other.idPli)
			return false;
		if (manche == null) {
			if (other.manche != null)
				return false;
		} else if (!manche.equals(other.manche))
			return false;
		return true;
	}
	
}
