package pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Joueur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="_id")
    private int idJoueur;
	private String Prenom;
	@OneToOne @JoinColumn(name="_idMain", nullable =false)
	private MainJ MainJ;
	@ManyToOne @JoinColumn(name="_idEquipe", nullable =false)
	private Equipe equipe;
	private int nbPartie;
	private int nbVictoire;
	private double nbMoyVictoire;
	private int ScoreMoy;
	
	
	public Joueur() {
		this("unknown",0,0,0,0);
	}
	
	public Joueur(String Prenom, int nbPartie, int nbVictoire, double nbMoyVictoire, int ScoreMoy) {
		this.set_Prenom(Prenom);
		this.set_nbPartie( nbPartie );
		this.set_nbVictoire( nbVictoire );
		this.set_nbMoyVictoire( nbMoyVictoire );
		this.set_ScoreMoy( ScoreMoy );
	}
	
	public int get_idJoueur() {
		return idJoueur;
	}
	public int get_nbPartie() {
		return nbPartie;
	}
	public int get_nbVictoire() {
		return nbVictoire;
	}
	public double get_nbMoyVictoire() {
		return nbMoyVictoire;
	}
	public int get_ScoreMoy() {
		return ScoreMoy;
	}
	
	public MainJ get__MainJ() {
		return MainJ;
	}
	
	public String get_Prenom() {
		return Prenom;
	}

	public void set_nbPartie(int nbPartie) {
		this.nbPartie = nbPartie;
	}
	
	public void set_nbVictoire(int nbVictoire) {
		this.nbVictoire = nbVictoire;
	}
	
	public void set_nbMoyVictoire(double nbMoyVictoire) {
		this.nbMoyVictoire = nbMoyVictoire;
	}
	
	public void set_ScoreMoy(int ScoreMoy) {
		this.ScoreMoy = ScoreMoy;
	}
	
	public void set_Prenom(String Prenom) {
		this.Prenom = Prenom;
	}

	@Override
	public String toString() {
		return "Joueur [idJoueur=" + idJoueur + ", Prenom=" + Prenom + ", MainJ=" + MainJ + ", equipe=" + equipe
				+ ", nbPartie=" + nbPartie + ", nbVictoire=" + nbVictoire + ", nbMoyVictoire=" + nbMoyVictoire
				+ ", ScoreMoy=" + ScoreMoy + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MainJ == null) ? 0 : MainJ.hashCode());
		result = prime * result + ((Prenom == null) ? 0 : Prenom.hashCode());
		result = prime * result + ScoreMoy;
		result = prime * result + ((equipe == null) ? 0 : equipe.hashCode());
		result = prime * result + idJoueur;
		long temp;
		temp = Double.doubleToLongBits(nbMoyVictoire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + nbPartie;
		result = prime * result + nbVictoire;
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
		Joueur other = (Joueur) obj;
		if (MainJ == null) {
			if (other.MainJ != null)
				return false;
		} else if (!MainJ.equals(other.MainJ))
			return false;
		if (Prenom == null) {
			if (other.Prenom != null)
				return false;
		} else if (!Prenom.equals(other.Prenom))
			return false;
		if (ScoreMoy != other.ScoreMoy)
			return false;
		if (equipe == null) {
			if (other.equipe != null)
				return false;
		} else if (!equipe.equals(other.equipe))
			return false;
		if (idJoueur != other.idJoueur)
			return false;
		if (Double.doubleToLongBits(nbMoyVictoire) != Double.doubleToLongBits(other.nbMoyVictoire))
			return false;
		if (nbPartie != other.nbPartie)
			return false;
		if (nbVictoire != other.nbVictoire)
			return false;
		return true;
	}
	
}


