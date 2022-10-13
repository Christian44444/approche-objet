package fr.diginamic.jdr;

public class Combat {
	Adversaire[] ennemis = new Adversaire[3];
	
	public boolean combattre(int type) {
		int a = 0;
		int b = 0;
		
		if (ennemis[type -1] == null) {
			ennemis[type -1] = new Adversaire(type);
		} 
		// Vérifier que l'adversaire n'a pas déjà perdu
		if (ennemis[type - 1].getPtsVie() <= 0) {
			System.out.println("Le " + type + " a déjà perdu!" );
		} else {
			// Le tableau est initialisé donc on passe au combat
			a = Personnage.getForce() + (int)Math.random() * (10) + 1;
			b = ennemis[type - 1].getForce() + (int)Math.random() * (10) + 1;
			if (a != b) {
				if (a>b) {
					a = a + a - b;
					b = b - a + b;
					if (b < 0) {
						b = 0;
					}
				} else {
					b = b + b - a;
					a = a - b + a;
					if (a < 0) {
						a = 0;
					}
				}
				Personnage.setPtsVie(a);
				ennemis[type - 1].setPtsVie(b);
				// vérifier si Personnage a perdu
				if (Personnage.getPtsVie() <= 0) {
					return false;
				}
			}
		}
		
		return true;
	}

	public Adversaire[] getEnnemis() {
		return ennemis;
	}

	public void setEnnemis(Adversaire[] ennemis) {
		this.ennemis = ennemis;
	}
	
	
	
}
