package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ville v1 = new Ville("Nice"       , 343000);
		Ville v2 = new Ville("Carcassonne",  47800);
		Ville v3 = new Ville("Narbonne"   ,  53400);
		Ville v4 = new Ville("Lyon"       , 484000);
		Ville v5 = new Ville("Foix"       ,   9700);
		Ville v6 = new Ville("Pau"        ,  77200);
		Ville v7 = new Ville("Marseille"  , 850700);
		Ville v8 = new Ville("Tarbes"     ,  40600);
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		
		mapVilles.put(v1.getNom(), v1);
		mapVilles.put(v2.getNom(), v2);
		mapVilles.put(v3.getNom(), v3);
		mapVilles.put(v4.getNom(), v4);
		mapVilles.put(v5.getNom(), v5);
		mapVilles.put(v6.getNom(), v6);
		mapVilles.put(v7.getNom(), v7);
		mapVilles.put(v8.getNom(), v8);
		
		Collection<Ville> lesVille = mapVilles.values(); 
		Iterator<Ville> it = lesVille.iterator();
		
		boolean first = true;
		String  cleVille = null;
		Integer nbHab = null;
		
		while (it.hasNext()) {
			Ville v = it.next();
			if (first) {
				cleVille = v.getNom();
				nbHab    = v.getNbHab();
				first = false;
			} else if (nbHab > v.getNbHab()) {
				nbHab = v.getNbHab();
				cleVille = v.getNom();
			}   
		}
		mapVilles.remove(cleVille);
		for (Ville v : lesVille) {
			System.out.println(v);
		}
	}

}
