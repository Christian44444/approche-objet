package fr.diginamic.banque.entites;

public class Compte {
	private String numeroCpt;
	private double soldeCpt;
	
	// Constructeur
	public Compte(String numeroCpt, double soldeCpt) { 
		super();
		this.numeroCpt = numeroCpt;
		this.soldeCpt = soldeCpt;
	}
	
	// Redéfinition de la classe toString
	@Override
	public String toString() {
		return "Compte [numeroCpt=" + numeroCpt + ", soldeCpt=" + soldeCpt + "]";
	}
	
	// getters et setters 

	public String getNumeroCpt() {
		return numeroCpt;
	}


	public void setNumeroCpt(String numeroCpt) {
		this.numeroCpt = numeroCpt;
	}

	public double getSoldeCpt() {
		return soldeCpt;
	}

	public void setSoldeCpt(double soldeCpt) {
		this.soldeCpt = soldeCpt;
	}
	
}
