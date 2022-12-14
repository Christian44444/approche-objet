package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

import fr.diginamic.testenumeration.Continent;
import listes.Ville;

public class MapVilles {

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
		
		HashMap<String, Ville> mapVilles = new HashMap<>();
		
		mapVilles.put(v1.getNom(), v1);
		mapVilles.put(v2.getNom(), v2);
		mapVilles.put(v3.getNom(), v3);
		mapVilles.put(v4.getNom(), v4);
		mapVilles.put(v5.getNom(), v5);
		mapVilles.put(v6.getNom(), v6);
		mapVilles.put(v7.getNom(), v7);
		mapVilles.put(v8.getNom(), v8);
		
		// ou bien for (Ville v: mapVilles) { mapVilles.put(v.getNom(), v); }
		
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
