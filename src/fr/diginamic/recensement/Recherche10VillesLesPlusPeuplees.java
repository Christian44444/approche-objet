package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Recherche10VillesLesPlusPeuplees extends MenuService{
	private int choix;
	private Scanner s1;
	
	public Recherche10VillesLesPlusPeuplees(int choix, Scanner s1) {
		super();
		this.choix = choix;
		this.s1    = s1;
	}

	@Override
	public void traiter() {
		String nomType = "";
		String valeurType = ""; 
		boolean trouve = false;
		// TODO Auto-generated method stub
		HashMap<String, Integer> maMap = new HashMap<>();
		switch (choix) {
		case 6: // D'un département
			nomType = "département";
			System.out.println("Veuillez sélectionner un " + nomType + " :");
			valeurType = s1.nextLine();
			break;
		case 7: // D'une région
			nomType = "région";
			System.out.println("Veuillez sélectionner une " + nomType + " :");
			valeurType = s1.nextLine();
			break;
		case 8: // De France
			nomType = "France";
			valeurType = null;
			trouve = true;
			break;
		}
		
		// On parcours les villes pour créer une hachmap avec uniquement les villes voulues
		// Parcours du tableau des villes de France
		for (VilleDeFrance v : Recensement.getListeVilleDeFrance()) {
			switch (choix) {
			case 6:
				if (v.getCodeDepartement().equals(valeurType)){
					maMap.put(v.getNomCommune(), v.getPopulationCommune());
					trouve = true;
				}
				break;
			case 7:
				if (v.getNomRegion().equals(valeurType)){
					maMap.put(v.getNomCommune(), v.getPopulationCommune());
					trouve = true;
				}
				break;
			default: // de France
				maMap.put(v.getNomCommune(), v.getPopulationCommune());
				break;
			}
		} 
		// La map est remplie avec les villes à trier
		if (trouve) {
			// Tableau des départements à remplir
			List<Top10> lt1 = new ArrayList<>();
			for (String nomVille : maMap.keySet()) {
				lt1.add(new Top10(nomVille, maMap.get(nomVille)));
			}
			
			Collections.sort(lt1, new ComparatorTop10());
			int i = 0;
			for (Top10 t1 : lt1) {
				if (i < 10) {
					System.out.println("Les villes les plus peuplées sont : " + t1.getNomVille() + " " + t1.getPopulation());
				} else {
					continue;
				}
				i++;
			}
		}

	}

	public int getChoix() {
		return choix;
	}

	public void setChoix(int choix) {
		this.choix = choix;
	}

	public Scanner getS1() {
		return s1;
	}

	public void setS1(Scanner s1) {
		this.s1 = s1;
	}

}
