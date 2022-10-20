package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSetSPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<SPays> hs1 = new HashSet<>();
		hs1.add(new SPays("USA",        332183000, 58492.0));
		hs1.add(new SPays("France",      67842582, 36660.0));
		hs1.add(new SPays("Allemagne",   83237124, 43290.0));
		hs1.add(new SPays("UK",          67081000, 40183.0)); 
		hs1.add(new SPays("Italie",      58983122, 30150.0));
		hs1.add(new SPays("Japon",      125681593, 33161.0));
		hs1.add(new SPays("Chine",     1412360000, 10616.0));
		hs1.add(new SPays("Russie",     145558000, 10324.0));
		hs1.add(new SPays("Inde",      1393409033,  1926.0));
		
		String maxSPIBparHab = "";
		Double maxDPIBparHab = 0.0;
		String maxSPIB       = "";
		Double maxDPIB       = 0.0; 
		String minSPIB       = "";
		Double minDPIB       = null; 
		for (Iterator<SPays> iterator = hs1.iterator(); iterator.hasNext();) {
			SPays sPays = (SPays) iterator.next();
			
			// Le pays avec le PIB/Hab. le plus élevé
			if (sPays.getpIBParHabitant() > maxDPIBparHab) {
				maxDPIBparHab = sPays.getpIBParHabitant();
				maxSPIBparHab = sPays.getNom();
			}
			// Le pays avec le plus grand pib
			if (sPays.getpIBParHabitant() * sPays.getNbHabitants() > maxDPIB) {
				maxDPIB = sPays.getpIBParHabitant() * sPays.getNbHabitants();
				maxSPIB = sPays.getNom();
			}
			// Le pays avec le plus petit pib
			if (minDPIB == null) {
				minDPIB = sPays.getpIBParHabitant() * sPays.getNbHabitants();
				minSPIB = sPays.getNom();
			} else if (sPays.getpIBParHabitant() * sPays.getNbHabitants() < minDPIB) {
				minDPIB = sPays.getpIBParHabitant() * sPays.getNbHabitants();
				minSPIB = sPays.getNom();
			}
		}
		System.out.println("Max pib/hab-> " + maxSPIBparHab + " " + maxDPIBparHab);
		System.out.println("Max pib total-> " + maxSPIB + " " + maxDPIB);
		
		// Mettre en majuscule le Pays qui a le PIB le plus petit
		for (Iterator<SPays> iterator = hs1.iterator(); iterator.hasNext();) {
			SPays sPays = (SPays) iterator.next();
		    if (sPays.getNom().equals(minSPIB) ) {
		     	sPays.setNom(sPays.getNom().toUpperCase());
		     	System.out.println("Min pib tot-> " + sPays.getNom() + " " + minDPIB);
		     	iterator.remove();
			}
		}
		
		for (SPays sPays : hs1) {
			System.out.println("Pays-> " + sPays.getNom() + " Nb habitants " + sPays.getNbHabitants() + " PIB " + sPays.getNbHabitants() * sPays.getpIBParHabitant() );
		}
	}

}
