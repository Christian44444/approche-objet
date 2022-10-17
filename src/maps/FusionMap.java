package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		HashMap<Integer, String> map2 = new HashMap<>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// créer une map3 qui contient l'ensemble des 2 maps précédentes
		HashMap<Integer, String> map3 = new HashMap<>();
		map3.putAll(map2);
		map3.putAll(map1);
		
		for (String s2 :map3.values()) {
			System.out.println(s2);
		}
	}

}
