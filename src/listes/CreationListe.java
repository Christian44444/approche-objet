package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nbrs = new ArrayList<>();
		
		for (int j = 1; j <= 100; j++) {
			nbrs.add(j);
		}
		System.out.println(nbrs.size());
	}

}
