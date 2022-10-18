package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Recherche10DepartementsLesPlusPeuples extends MenuService{
	// Afficher les 10 départements les plus peuplés
	
	@Override
	public void traiter() {
		// Remplissage des Départements
		HashMap<String, Integer> maMap = new HashMap<>();
		for (VilleDeFrance v : Recensement.getListeVilleDeFrance()) {
			if (maMap.get(v.getCodeDepartement()) != null) {
				maMap.put(v.getCodeDepartement(), maMap.get(v.getCodeDepartement()) + v.getPopulationCommune());
			} else {
				maMap.put(v.getCodeDepartement(), v.getPopulationCommune());
			}
		}
		
		// Tableau des départements à remplir
		List<DepartementDeFrance> ld1 = new ArrayList<>();
		for (String codeDep : maMap.keySet()) {
			ld1.add(new DepartementDeFrance(codeDep, maMap.get(codeDep)));
		}
		
		Collections.sort(ld1, new ComparatorDepartementDeFrance());
		int i = 0;
		for (DepartementDeFrance d1 : ld1) {
			if (i < 10) {
				System.out.println(d1.getCodeDepartement() + " " + d1.getPopulationDepartement());
			} else {
				continue;
			}
			i++;
		}
	}
}
