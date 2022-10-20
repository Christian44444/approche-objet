package tri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class TestTriVille {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		// Collections.sort(listeVilles); java.lang.Comparable voir implements de la classe Ville
		
		// java.util.Comparator voir Class ComparatorHabitant
		Collections.sort(listeVilles, new ComparatorHabitant()); // tri sur le nombre d'habitants
		Collections.sort(listeVilles, new ComparatorVille()); // tri sur le nom
		for (Ville ville : listeVilles) {
			System.out.println(ville);
			
		}

	}

}
