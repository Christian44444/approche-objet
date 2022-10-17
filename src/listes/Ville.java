package listes;


public class Ville implements Comparable<Ville>{
	private String nom;
	private Integer nbHab;
	
	public Ville(String nom, Integer nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
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
