package listes;
/**
 * Représente le concept de Ville avec un nom et un nombre d'habitant.
 * @author cmich
 *
 */
public class Ville implements Comparable<Ville>{
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
	public Ville(String nom, Integer nbHab) {
		super();
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
		return autre.getNom().equals(this.getNom()) && (autre.getNbHab().equals(this.getNbHab()));
		
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
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + "]";
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
