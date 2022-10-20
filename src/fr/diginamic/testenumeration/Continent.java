package fr.diginamic.testenumeration;


/**
 * Enumération des Continents (utilisée en exemple avec la classe Ville du TP sur les listes)
 * @author cmich
 *
 */
public enum Continent {
	/** Objet EURASIE */
	EURASIE("Eurasie"),
	/** Objet AMERIQUE */
	AMERIQUE("Amérique"),
	/** Objet AFRIQUE */
	AFRIQUE("Afrique"),
	/** Objet OCEANIE */
	OCEANIE("Océanie");
	
	/** Nom : String valeur de la constante */
	private String nom;
	
	/**
	 * Contructeur privé des objets Continent
	 * @param string La valeur
	 */
	Continent(String nom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
	}
	
	/**
	 * @return le nom du continet
	 */
	public String getNom() {
		return nom;
	}

	
	
	
	
	
	
}
