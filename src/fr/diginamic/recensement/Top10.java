package fr.diginamic.recensement;

public class Top10 {
	private String  nomVille;
	private Integer population;
	
	public Top10(String nomVille, Integer population) {
		super();
		this.nomVille = nomVille;
		this.population = population;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public Integer getPopulation() {
		return population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

}
