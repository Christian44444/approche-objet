package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorTop10 implements Comparator<Top10>{

	@Override
	public int compare(Top10 t1, Top10 t2) {
		// TODO Auto-generated method stub
		
		return t2.getPopulation().compareTo(t1.getPopulation());
	}
	
}
