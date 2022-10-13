package fr.diginamic.entites;

public class Theatre {
	String nom;
	int    nbPersMax;
	int    totalClientsInscrits;
	double recetteTotaleEtablissement;
	
	
	
	public Theatre(String nom, int nbPersMax, int totalClientsInscrits, double recetteTotaleEtablissement) {
		super();
		this.nom = nom;
		this.nbPersMax = nbPersMax;
		this.totalClientsInscrits = totalClientsInscrits;
		this.recetteTotaleEtablissement = recetteTotaleEtablissement;
	}



	public boolean inscrire(int nbPers, double prixPlace) {
		// TODO ici
		if (nbPersMax >= totalClientsInscrits + nbPers) {
			totalClientsInscrits+=nbPers;
			recetteTotaleEtablissement+= (nbPers*prixPlace);
			return true;
		} else {
			System.out.println("Désolé, la capacité maximale du théatre est atteinte!");
			return false;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPersMax() {
		return nbPersMax;
	}

	public void setNbPersMax(int nbPersMax) {
		this.nbPersMax = nbPersMax;
	}

	public int getTotalClientsInscrits() {
		return totalClientsInscrits;
	}

	public void setTotalClientsInscrits(int totalClientsInscrits) {
		this.totalClientsInscrits = totalClientsInscrits;
	}

	public double getRecetteTotaleEtablissement() {
		return recetteTotaleEtablissement;
	}

	public void setRecetteTotaleEtablissement(double recetteTotaleEtablissement) {
		this.recetteTotaleEtablissement = recetteTotaleEtablissement;
	}
}
