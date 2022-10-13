package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok = true;
		
		Theatre t1 = new Theatre("Théatre Gralin", 500, 0, 0);
		while (ok) {
			if (t1.inscrire(4, 22.50)) {
				System.out.println("Inscrits " + t1.getTotalClientsInscrits() + " recette actuelle: " + t1.getRecetteTotaleEtablissement());
			} else {
				System.out.println("Total inscrits " + t1.getTotalClientsInscrits() + " recette totale: " + t1.getRecetteTotaleEtablissement());
				ok = false;
			}
		}	
		
	}

}
