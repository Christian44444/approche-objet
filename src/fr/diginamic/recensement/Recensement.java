package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Recensement {
	private static List<VilleDeFrance> listeVilleDeFrance;
	
	public static void chargement() throws IOException {
		if (listeVilleDeFrance == null) {
			// Ne pas oublier de créer le tableau listeVilleDeFrance
			listeVilleDeFrance = new ArrayList<>();
			
			// Lecture du fichier des villes
			String monFichier = "C:\\Users\\cmich\\Documents\\Christian\\Pole Emploi\\Diginamic\\Cours\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
			Path chemin = Paths.get(monFichier);
			List<String> lignes = Files.readAllLines(chemin, StandardCharsets.UTF_8);
			// ne pas traiter la première ligne
			boolean first = true;
			
			
			for (String l: lignes) {
				String[] ligneDecoupee = l.split(";");
				if (first) {
					first = false;
				} else {
									
					VilleDeFrance vDF = new VilleDeFrance(ligneDecoupee[0], ligneDecoupee[1], ligneDecoupee[2], ligneDecoupee[5],ligneDecoupee[6],Integer.parseInt(ligneDecoupee[9].replaceAll("\\s",""))); 
					listeVilleDeFrance.add(vDF);
				}
			}
		}
	}

	public static List<VilleDeFrance> getListeVilleDeFrance() {
		return listeVilleDeFrance;
	}
	
	
}
