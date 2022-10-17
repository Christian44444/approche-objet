package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CreerFichier {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String monFichier = "C:\\Users\\cmich\\Documents\\Christian\\Pole Emploi\\Diginamic\\Cours\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\recensement.csv";
		String maCreation = "C:\\Users\\cmich\\Documents\\Christian\\Pole Emploi\\Diginamic\\Cours\\7 - Langage Java - Approche Objet\\J5 & J6 - Collections et fichiers\\TP\\creerfichier.csv";
		
		Path pathFile = Paths.get(monFichier);
		
		List<String> ligneList = Files.readAllLines(pathFile, StandardCharsets.UTF_8);
		
		List<String> ligneCopiee = new ArrayList<>();
		
		int i = 0;
		// Copie des 100 premières lignes du fichier source
		for (i = 0 ; i < 100 ; i++) {
			ligneCopiee.add(ligneList.get(i));
		}
		// Préparation du fichier cible
		Path pathCible = Paths.get(maCreation);
		Files.write(pathCible, ligneCopiee);
	}

}
