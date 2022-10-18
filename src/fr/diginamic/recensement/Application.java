package fr.diginamic.recensement;

import java.io.IOException;
import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Application {

	public static void main(String[] args) throws IOException {
		// Variable générique au service
		MenuService recherche;
		
		// Génération du menu 
		Scanner scanner = new Scanner(System.in) ;
		// Valeur du menu demandé
		String s1 = ""; 
		int choix; 

		// Récupération des villes de France et création de la liste des villes (Class Recencement)
		Recensement.chargement();
		
		// Le menu
		System.out.println("- 1. Population d'une ville donnée");
		System.out.println("- 2. Population d'un département donné");
		System.out.println("- 3. Population d'une région donnée");
		System.out.println("- 4. Afficher les 10 régions les plus peuplées");
		System.out.println("- 5. Afficher les 10 départements les plus peuplés");
		System.out.println("- 6. Afficher les 10 villes les plus peuplées d'un département");
		System.out.println("- 7. Afficher les 10 villes les plus peuplées d'une région");
		System.out.println("- 8. Afficher les 10 villes les plus peuplées de France");
		System.out.println("- 9. Sortir");
		// Parser la console
		boolean ok = true;
		while (ok) {
			s1 = scanner.nextLine();
			try { 
				choix = Integer.parseInt(s1);
				switch (choix) {
				case 1:
					recherche = new RecherchePopulationVille(scanner);
					recherche.traiter();
					break;
				case 2:
					recherche = new RecherchePopulationDepartement(scanner);
					recherche.traiter();
					break;
				case 3:
					recherche = new RecherchePopulationRegion(scanner);
					recherche.traiter();
					break;
				case 4:
					recherche = new Recherche10RegionsLesPlusPeuplees();
					recherche.traiter();
					break;
				case 5:
					recherche = new Recherche10DepartementsLesPlusPeuples();
					recherche.traiter();
					break;
				case 6: // D'un département
				case 7: // D'une région
				case 8: // De la France
					recherche = new Recherche10VillesLesPlusPeuplees(choix, scanner);
					recherche.traiter();
					break;
				case 9:
					ok = false;
					break;
				default:
					// JOptionPane.showMessageDialog(null, "La saisie n'est pas dans le menu!", "Erreur", JOptionPane.ERROR_MESSAGE);
					System.out.println("La saisie n'est pas dans le menu!");
					break;
				}
				
			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println("La saisie n'est pas valide!");
				
				// JOptionPane.showMessageDialog(null, "La saisie n'est pas dans le menu!", "Erreur", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		// Fermeture du scanner
		scanner.close();
	}

}
