package entite2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adrPersonne; // créer sans constructeur= new AdressePostale();
	
	// Constructeur de la classe avec paramètres
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public Personne(String nom, String prenom, AdressePostale adrPersonne) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adrPersonne = adrPersonne;
	}
	
	
	
}
