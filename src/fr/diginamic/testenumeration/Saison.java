package fr.diginamic.testenumeration;


public enum Saison {
	/** Objet PRINTEMPS */
	PRINTEMPS("Printemps",1),
	/** Objet ETE */
	ETE("Eté",2),
	/** Objet AUTOMNE */
	AUTOMNE("Automne",3),
	/** Objet HIVER */
	HIVER("Hiver",4);

	/** Nom : valeur de la constante */
	private String nom;
	/** Rang : Position dans l'année */
	private Integer rang;
	
	/**
	 * Contructeur privé des objets saison
	 * @param string La valeur
	 * @param i Son rang dans l'année
	 */
	Saison(String nom, int rang) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.rang = rang;
	}
	
	
	/**
	 * Permet de retourner l'objet correspondant au nom recherché
	 * @param libelle  le libellé de la Saison
	 * @return object Saison 
	 */
	public static Saison recupSaison(String libelle) {
		// static est important pour pouvoir accéder à la méthode par Saison.recupSaison(String);
		for (Saison s1:Saison.values()) {
			if (s1.getNom().equals(libelle) ) {
				return s1;
			}	
		} 
		
		return null;
	}

	/**
	 * @return le nom de la saison
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return le rang de la saison
	 */
	public Integer getRang() {
		return rang;
	}
	
	
	
	
	
	
}
