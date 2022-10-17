package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pays> mesPays = new ArrayList<>();
		
		mesPays.add(new Pays("France", 65000000, "Europe"));
		mesPays.add(new Pays("Allemagne", 80000000, "Europe"));
		mesPays.add(new Pays("Belgique", 10000000, "Europe"));
		mesPays.add(new Pays("Russie", 150000000, "Asie"));
		mesPays.add(new Pays("Chine", 1400000000, "Asie"));
		mesPays.add(new Pays("Indonésie", 220000000, "Océanie"));
		mesPays.add(new Pays("Australie", 20000000, "Océanie"));
		
		HashMap<String, Integer> maMap = new HashMap<>(); // contient en clé le continent et en valeur Le comptage des pays
		
		for (Pays pays : mesPays) {
			if (pays.getContinent() == "Europe") {
				if (maMap.get("Europe") != null) {
					maMap.put("Europe", maMap.get("Europe") + 1);
				} else {
					maMap.put("Europe", 1);
				} 
			} else if (pays.getContinent() == "Asie") {
					if (maMap.get("Asie") != null) {
						maMap.put("Asie", maMap.get("Asie") + 1);
					} else {
						maMap.put("Asie", 1);
					}	
			} else {
					if (maMap.get("Océanie") != null) {
						maMap.put("Océanie", maMap.get("Océanie") + 1);
					} else {
						maMap.put("Océanie", 1);
					}
			}
		}
		
		Set<String> keys = maMap.keySet();
		
		for (String k : keys) {
			System.out.println(k + " Nombre de villes du continent " + maMap.get(k));
		}
	}
}
