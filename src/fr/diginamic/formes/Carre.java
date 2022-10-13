package fr.diginamic.formes;

public class Carre extends Rectange{
	private double longueur;
	
	public Carre(double longueur) {
		super(longueur, longueur);
		// TODO Auto-generated constructor stub
		this.longueur = longueur;
	}

	@Override
	public String toString() {
		return "Carre [Surface :" + calculerSurface() + " Périmètre :" + calculerPerimetre() + "]";
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

}
