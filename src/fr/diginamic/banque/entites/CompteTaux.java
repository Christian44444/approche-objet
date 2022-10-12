package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
	private double tauxRemuneration ;
	
	// Constructeur avec appel à celui de la classe mère Compte(String numeroCpt, double soldeCpt)
	public CompteTaux(String numeroCpt, double soldeCpt, double tauxRemuneration) {
		super(numeroCpt, soldeCpt);
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + " CompteTaux [tauxRemuneration=" + tauxRemuneration + "]";
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}


	

}
