package fr.diginamic.entites;

public class Cercle {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	public double permietre() {
		return 2 * Math.PI * rayon; 
	}
	
	public double surface() {
		return Math.PI * rayon * rayon; // Pour les puissances	Math.pow(rayon, 2).
	}
	
	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
