package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<Villes> mesVilles = new ArrayList<>();
		
		
		String monFichier = "C:\\Users\\cmich\\Documents\\Christian\\Pole Emploi\\Diginamic\\Cours\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		Path chemin = Paths.get(monFichier);
		List<String> lignes = Files.readAllLines(chemin, StandardCharsets.UTF_8);
		// ne pas traiter la première ligne
		boolean first = true;
		
		String enteteFichier = "";
		
		for (String l: lignes) {
			String[] ligneDecoupee = l.split(";");
			if (first) {
				first = false;
				enteteFichier = ligneDecoupee[6] + ";" +
								ligneDecoupee[2] + ";" +
								ligneDecoupee[1] + ";" +
								ligneDecoupee[9] + ";";
			} else {
								
				Villes v = new Villes(ligneDecoupee[6], ligneDecoupee[2], ligneDecoupee[1], Integer.parseInt(ligneDecoupee[9].replaceAll("\\s",""))); 
				mesVilles.add(v);
			}
		}
		for (Villes v : mesVilles) {
			System.out.println(v);
		}
		// Création du fichier de sorti
		// Constitution de la liste des lignes de sortie
		List<String> lignesSorties = new ArrayList<>();
		
		// Ecriture de la ligne d'entête
		lignesSorties.add(enteteFichier);
			
		// Ecriture des lignes de données
		for (Villes v : mesVilles) {
			if (v.getPopTotale() > 25000) {
				lignesSorties.add(v.getNom() + ";" + v.getCodeDep() + ";" + v.getNomRegion() + ";" + v.getPopTotale().toString() + ";");	
			}
		}
		
		String monFichierSorti = "C:\\Users\\cmich\\Documents\\Christian\\Pole Emploi\\Diginamic\\Cours\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\resultat.csv";
		chemin = Paths.get(monFichierSorti);
		/* Ecriture des lignes */
		Files.write(chemin, lignesSorties);
		
	}
}

