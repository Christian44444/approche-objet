package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService{
	private Scanner s1;
	
	public RecherchePopulationDepartement(Scanner s1) {
		super();
		this.s1 = s1;
	}
	
	public void traiter() {
		String monDepartement = "";
		boolean trouve = false;
		
		System.out.println("Veuillez taper le code du département dont vous voulez la population: ");
		monDepartement = s1.nextLine();
		Integer total = 0;
		// Parcours du tableau r1 pour trouver la ville
		for (VilleDeFrance vDF : Recensement.getListeVilleDeFrance()) {
			if (vDF.getCodeDepartement().equals(monDepartement)  ) {
				total = total + vDF.getPopulationCommune();
				trouve = true;
			}
		}
		if (!trouve) {
			System.out.println("Ce département n'existe pas! ");
		} else {
			System.out.println("Pour le " + monDepartement + " la population est de: " + total);
		} 
	}	
	
	
	
}
