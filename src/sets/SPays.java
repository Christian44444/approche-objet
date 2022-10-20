package sets;

/**
 * Classe Pays pour les exercices sur les set
 * @author cmich
 *
 */
public class SPays {
	/** nom Dénomination du pays */
	private String  nom;
	/** nbHabitans Nombre d'habitants du pays */
	private Integer nbHabitants;
	/** nom Produit intérieur brut par habitant du pays */
	private Double  pIBParHabitant;
	
	/**
	 * @param nom nom du Pays
	 * @param nbHabitants nombre d'habitants
	 * @param pIBParHabitant PIB par Habitant
	 */
	public SPays(String nom, Integer nbHabitants, Double pIBParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pIBParHabitant = pIBParHabitant;
	}

	
	@Override
	public String toString() {
		return "SPays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pIBParHabitant=" + pIBParHabitant + "]";
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitants
	 */
	public Integer getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(Integer nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the pIBParHabitant
	 */
	public Double getpIBParHabitant() {
		return pIBParHabitant;
	}

	/**
	 * @param pIBParHabitant the pIBParHabitant to set
	 */
	public void setpIBParHabitant(Double pIBParHabitant) {
		this.pIBParHabitant = pIBParHabitant;
	}
	
	
	
}
