package maps;

public class Pays {
	private String nom;
	private Integer nbHab;
	private String continent;
	
	public Pays(String nom, Integer nbHab, String continent) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", continent=" + continent + "]";
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

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	
}
