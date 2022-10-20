package listes;

import fr.diginamic.testenumeration.Continent;

/**
 * Représente le concept de Ville avec un nom et un nombre d'habitant.
 * @author cmich
 *
 */
public class Ville implements Comparable<Ville>{
	/** Continent de la ville cf Package Continent ci-dessus */
	private Continent continent;
	/** Nom de la ville	 */
	private String nom;
	/** Nombre d'habitants	 */
	private Integer nbHab;
	/**
	 * Constructeur
	 * 
	 * @param nom nom de la ville
	 * @param nbHab nombre d'habitants
	 */
	public Ville(Continent continent, String nom, Integer nbHab) {
		super();
		this.continent = continent;
		this.nom = nom;
		this.nbHab = nbHab;
	}
	@Override
	public boolean equals(Object obj) {
		 
		if (obj == null || !(obj instanceof Ville) ) {
			return false;	
		}
		// Là on a une ville et elle est valide
		// On doit caster obj pour accéder à ses propriétés
		Ville autre = (Ville)obj;
		// Attention ne gère pas les attributs null de l'objet qui porte le .<méthode()> 
		return autre.getContinent().equals(this.getContinent()) && autre.getNom().equals(this.getNom()) && (autre.getNbHab().equals(this.getNbHab()));
		
		// Le test d'égalité est fait dans la classe TestVille()
	}
	
	@Override
	public int compareTo(Ville o) {
		// TODO Auto-generated method stub
// tri sur le nom		return this.getNom().compareTo(o.getNom());
		// tri sur le nombre d'habitants
		if (this.getNbHab() > o.getNbHab()) {
			return 1;
		} else if (this.getNbHab() < o.getNbHab()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + " continent=" + continent.getNom() + "]";
	}


	/**
	 * @return continent
	 */
	public Continent getContinent() {
		return continent;
	}

	/**
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	
	/**
	 * @param continent le continent to set
	 */
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	
	/**
	 * @return nombre d'habitants
	 */
	public Integer getNbHab() {
		return nbHab;
	}

	/**
	 * @param nbHab
	 */
	public void setNbHab(Integer nbHab) {
		this.nbHab = nbHab;
	}

}
