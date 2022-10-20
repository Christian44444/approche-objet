package listes;

import java.util.ArrayList;
import java.util.Arrays;

import fr.diginamic.testenumeration.Continent;

public class TestVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville(Continent.EURASIE, "Nice"       , 343000);
		Ville v2 = new Ville(Continent.EURASIE, "Carcassonne",  47800);
		Ville v3 = new Ville(Continent.EURASIE, "Narbonne"   ,  53400);
		Ville v4 = new Ville(Continent.EURASIE, "Lyon"       , 484000);
		Ville v5 = new Ville(Continent.EURASIE, "Foix"       ,   9700);
		Ville v6 = new Ville(Continent.EURASIE, "Pau"        ,  77200);
		Ville v7 = new Ville(Continent.EURASIE, "Marseille"  , 850700);
		Ville v8 = new Ville(Continent.EURASIE, "Tarbes"     ,  40600);
		
		ArrayList<Ville> listeVilles = new ArrayList<>();
		listeVilles.addAll(Arrays.asList(v1, v2, v3, v4, v5, v6, v7, v8));
		
		Integer maxPeuple = null;
		String  maxVille  = new String();
		for (Ville ville : listeVilles) {
			if (maxPeuple == null) {
				maxPeuple = ville.getNbHab();
				maxVille  = ville.getNom();
			} else {
				maxPeuple = maxPeuple > ville.getNbHab() ? maxPeuple : ville.getNbHab();
				maxVille  = maxPeuple > ville.getNbHab() ? maxVille  : ville.getNom(); 
			}
		}
		System.out.println(maxVille);
		// Méthode tordue à ne pas utiliser en entreprise
		for (int i = 0; i < listeVilles.size(); i++) {
			listeVilles.set(i, listeVilles.get(i).getNbHab() > 100000 ? new Ville(listeVilles.get(i).getContinent(), listeVilles.get(i).getNom().toUpperCase(), listeVilles.get(i).getNbHab()) : listeVilles.get(i));
		}
		System.out.println(listeVilles);
		
	}

}
