package fr.diginamic.recensement;

public class VilleDeFrance {
	private String  codeRegion;
	private String  nomRegion;
	private String  codeDepartement;
	private String  codeCommune;
	private String  nomCommune;
	private Integer populationCommune;
	
	public VilleDeFrance(String codeRegion, String nomRegion, String codeDepartement, String codeCommune,
			String nomCommune, Integer populationCommune) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationCommune = populationCommune;
	}

	@Override
	public String toString() {
		return "VilleDeFrance [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement="
				+ codeDepartement + ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune
				+ ", populationCommune=" + populationCommune + "]";
	}

	public String getCodeRegion() {
		return codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public String getCodeCommune() {
		return codeCommune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public Integer getPopulationCommune() {
		return populationCommune;
	}
	
	
	
	
	
}
