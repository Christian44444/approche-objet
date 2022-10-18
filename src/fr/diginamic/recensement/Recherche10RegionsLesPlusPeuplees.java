package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class Recherche10RegionsLesPlusPeuplees extends MenuService{
	// Affichier les 10 régions les plus peuplées
	
	@Override
	public void traiter() {
		// Remplissage des régions
		HashMap<String, Integer> maMap = new HashMap<>(); // contient en clé la région et en valeur Le comptage de sa population
		for (VilleDeFrance v : Recensement.getListeVilleDeFrance()) {
			if (maMap.get(v.getNomRegion()) != null) {
				maMap.put(v.getNomRegion(), maMap.get(v.getNomRegion()) + v.getPopulationCommune());
			} else {
				maMap.put(v.getNomRegion(), v.getPopulationCommune());
			}
		}
		
		// Tableau des régions à remplir
		List<RegionDeFrance> lr1 = new ArrayList<>();
		for (String nomRegion : maMap.keySet()) {
			
			lr1.add(new RegionDeFrance(nomRegion, maMap.get(nomRegion)));
		}
		
		Collections.sort(lr1, new ComparatorRegionDeFrance());
		int i = 0;
		for (RegionDeFrance r1 :lr1) {
			if (i < 10) {
				System.out.println(r1.getnomRegion() + " " + r1.getPopulationRegion());	
			} else {
				continue;
			}
			i++;
		}
	}
}
