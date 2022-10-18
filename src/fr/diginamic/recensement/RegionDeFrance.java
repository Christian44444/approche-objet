package fr.diginamic.recensement;

public class RegionDeFrance {
	private String  nomRegion;
	private Integer populationRegion;
	
	public RegionDeFrance(String nomRegion, Integer populationRegion) {
		super();
		this.nomRegion = nomRegion;
		this.populationRegion = populationRegion;
	}
	public String getnomRegion() {
		return nomRegion;
	}
	public void setnomRegion(String codeRegion) {
		this.nomRegion = codeRegion;
	}
	public Integer getPopulationRegion() {
		return populationRegion;
	}
	public void setPopulationRegion(Integer populationRegion) {
		this.populationRegion = populationRegion;
	}
	
	

}
