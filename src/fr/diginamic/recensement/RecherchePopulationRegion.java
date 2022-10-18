package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService{
	private Scanner s1;
	
	public RecherchePopulationRegion(Scanner s1) {
		super();
		this.s1 = s1;
	}
	
	public void traiter() {
		String maRegion = "";
		boolean trouve = false;
		
		System.out.println("Veuillez taper le nom de la région dont vous voulez la population: ");
		maRegion = s1.nextLine();
		Integer total = 0;
		// Parcours du tableau r1 pour trouver la ville
		for (VilleDeFrance vDF : Recensement.getListeVilleDeFrance()) {
			if (vDF.getNomRegion().equals(maRegion)  ) {
				total = total + vDF.getPopulationCommune();
				trouve = true;
			}
		}
		if (!trouve) {
			System.out.println("Cette région n'existe pas! ");
		} else {
			System.out.println("Pour la région " + maRegion + " la population est de: " + total);
		} 
	}	
	
	
	
}
