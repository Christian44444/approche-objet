package listes;


public class Ville {
	private String nom;
	private Integer nbHab;
	
	public Ville(String nom, Integer nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}
	
	
	
	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHab=" + nbHab + "]";
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getNbHab() {
		return nbHab;
	}

	public void setNbHab(Integer nbHab) {
		this.nbHab = nbHab;
	}
	
	
	
		

}
