package fr.diginamic.salarie;

public abstract class Intervenant {
	protected String nom;
	protected String prenom;
	
	
	
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	
	public void afficherDonnees() {
		if (this instanceof Salarie) {
			System.out.println("Nom: " + this.nom + " " + this.prenom + " Gagne : " + this.getSalaire() + " est salarié.");
		} else if (this instanceof Pigiste){
			System.out.println("Nom: " + this.nom + " " + this.prenom + " Gagne : " + this.getSalaire() + " est pigiste.");
		} else {
			System.out.println("Cet objet n'est pas un Intervenant valide!");
		}
	}
}
