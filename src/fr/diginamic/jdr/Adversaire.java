package fr.diginamic.jdr;

public class Adversaire {
	int typeAdversaire;
	int force;
	int ptsVie;
	public Adversaire(int typeAdversaire) {
		super();
		this.typeAdversaire = typeAdversaire;
		this.force = valeurForce(typeAdversaire);
		this.ptsVie = valeurPtsVie(typeAdversaire);
	}
	
	public int valeurForce(int type) {
		int a = 0;
		int b = 0;
		switch (type) {
		case 1: 
			a = 3;
			b = 8;
			break;
		case 2: 
			a = 5;
			b = 10;
			break;
		case 3: 
			a = 10;
			b = 15;
			break;
		}
		int[] fourchette = {a,b};
		return (int)Math.random() * (fourchette[1] - fourchette[0]) + fourchette[0];
	}
	public int valeurPtsVie(int type) {
		int a = 0;
		int b = 0;
		switch (type) {
		case 1: 
			a = 5;
			b = 10;
			break;
		case 2: 
			a = 10;
			b = 15;
			break;
		case 3: 
			a = 20;
			b = 30;
			break;
		}
		int[] fourchette = {a,b};
		return (int)Math.random() * (fourchette[1] - fourchette[0]) + fourchette[0];
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getPtsVie() {
		return ptsVie;
	}

	public void setPtsVie(int ptsVie) {
		this.ptsVie = ptsVie;
	}
	
	
	
}
