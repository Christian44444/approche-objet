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
	// les gets et Sets
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	// met et affiche nom et prénom Nom en majuscule 
	public void affichNomPrenom() {
		System.out.println(nom.toUpperCase() + " " + prenom);
	}
	
	
	public void setAdrPersonne(AdressePostale adrPersonne) {
		this.adrPersonne = adrPersonne;
	}

	public 	void changeAdresse(int numero, String libelleR, int codeP, String villeA) {
		AdressePostale p2 = new AdressePostale(numero, libelleR, codeP, villeA);
		this.adrPersonne = p2;
	}
	
	
	
}
