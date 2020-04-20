package com.github.qpavageau.belote.src.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Carte { 
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="_id")
    private int idCarte;
	private String Couleur;
	private int Valeur;
	private String Nom;
	@Column(columnDefinition="tinyint(1) default 0")
	private int Atout;
	@ManyToOne @JoinColumn(name="_idMain", nullable =false)
	private MainJ Main;
	@ManyToOne @JoinColumn(name="_idPaquet", nullable =false)
	private Paquet paquet;
	
	public Carte() {  					
        
    }
    
    
    public Carte(int id, String Couleur, int Valeur, String Nom, int Atout) {
    	this.set_id( id);
        this.set_Couleur( Couleur );
        this.set_Valeur( Valeur );
        this.set_Nom( Nom );
        this.set_Atout( Atout );
//        this.set_Main(Main);
//        this.set_Paquet(paquet);
    }


    public int get_idCarte() {
        return idCarte;
    }
    
    public String get_Couleur() {
        return Couleur;
    }
    
    public int get_Valeur() {
        return Valeur;
    }
    
    public String get_Nom() {
        return Nom;
    }
    
    public int is_Atout() {
        return Atout;
    }
     
    public void set_Couleur(String Couleur) {
        this.Couleur = Couleur;
    }
    
    public void set_Valeur(int Valeur) {
        this.Valeur = Valeur;
    }
    
    public void set_Nom(String Nom) {
        this.Nom = Nom;
    }
    
    public void set_Atout(int Atout) {
        this.Atout = Atout;
    }
    
    public void set_id(int id) {
    	this.idCarte = id;
    }


	@Override
	public String toString() {
		return "Carte [idCarte=" + idCarte + ", Couleur=" + Couleur + ", Valeur=" + Valeur + ", Nom=" + Nom + ", Atout="
				+ Atout + ", Main=" + Main + ", paquet=" + paquet + "]";
	}
    
//    public void set_Main(MainJ Main) {
//    	this.Main = Main;
//    }
//    
//    public void set_Paquet(Paquet Paquet) {
//    	this.paquet = Paquet;
//    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Atout;
		result = prime * result + ((Couleur == null) ? 0 : Couleur.hashCode());
		result = prime * result + ((Main == null) ? 0 : Main.hashCode());
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		result = prime * result + Valeur;
		result = prime * result + idCarte;
		result = prime * result + ((paquet == null) ? 0 : paquet.hashCode());
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
		Carte other = (Carte) obj;
		if (Atout != other.Atout)
			return false;
		if (Couleur == null) {
			if (other.Couleur != null)
				return false;
		} else if (!Couleur.equals(other.Couleur))
			return false;
		if (Main == null) {
			if (other.Main != null)
				return false;
		} else if (!Main.equals(other.Main))
			return false;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (Valeur != other.Valeur)
			return false;
		if (idCarte != other.idCarte)
			return false;
		if (paquet == null) {
			if (other.paquet != null)
				return false;
		} else if (!paquet.equals(other.paquet))
			return false;
		return true;
	}
}
    
    