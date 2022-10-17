package fichier;

public class Villes {
	private String nom;
	private String codeDep;
	private String nomRegion;
	private Integer popTotale;
	
	public Villes(String nom, String codeDep, String nomRegion, Integer popTotale) {
		super();
		this.nom = nom;
		this.codeDep = codeDep;
		this.nomRegion = nomRegion;
		this.popTotale = popTotale;
	}

	@Override
	public String toString() {
		return "Villes [nom=" + nom + ", codeDep=" + codeDep + ", nomRegion=" + nomRegion + ", popTotale=" + popTotale
				+ "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCodeDep() {
		return codeDep;
	}

	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public Integer getPopTotale() {
		return popTotale;
	}

	public void setPopTotale(Integer popTotale) {
		this.popTotale = popTotale;
	}
	
	
}
