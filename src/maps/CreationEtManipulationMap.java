package maps;

import java.util.HashMap;
import java.util.Set;


public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		
		// TODO exercice 2
		mapVilles.put(59,"Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		Set<Integer> keys = mapVilles.keySet();
		
		for (Integer k : keys) {
			System.out.println(k);
		}
		
//		// Solution 1
//		Collection<String> lesVille = mapVilles.values(); 
//		Iterator<String> it = lesVille.iterator();
//		
//		while (it.hasNext()) {
//			String s = it.next();
//			System.out.println(s);
//		}
		// Solution 2
		for (String s2 :mapVilles.values()) {
			System.out.println(s2);
		}
		System.out.println(mapVilles.size());
	}

}
