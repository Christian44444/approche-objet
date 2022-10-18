package fr.diginamic.recensement;

public class DepartementDeFrance {
	private String  codeDepartement;
	private Integer populationDepartement;
	
	public DepartementDeFrance(String codeDepartement, Integer populationDepartement) {
		super();
		this.codeDepartement = codeDepartement;
		this.populationDepartement = populationDepartement;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public Integer getPopulationDepartement() {
		return populationDepartement;
	}

	public void setPopulationDepartement(Integer populationDepartement) {
		this.populationDepartement = populationDepartement;
	}
	
	
}
