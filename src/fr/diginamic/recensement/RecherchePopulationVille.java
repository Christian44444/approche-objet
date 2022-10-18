package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
	private Scanner s1;
	
	public RecherchePopulationVille(Scanner s1) {
		super();
		this.s1 = s1;
	}
	
	public void traiter() {
		String maVille = "";
		boolean trouve = false;
		
		System.out.println("Veuillez taper le nom de la ville dont vous voulez la population: ");
		maVille = s1.nextLine();
		
		// Parcours du tableau r1 pour trouver la ville
		for (VilleDeFrance vDF : Recensement.getListeVilleDeFrance()) {
			if (vDF.getNomCommune().equals(maVille)  ) {
				System.out.println("Pour " + maVille + " la population est de: " + vDF.getPopulationCommune());
				trouve = true;
			}
		}
		if (!trouve) {
			System.out.println("Cette ville ne fait pas parti des communes de France! ");
			
		}
	}	
	
	
	
}
