package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparatorDepartementDeFrance implements Comparator<DepartementDeFrance>{

	@Override
	public int compare(DepartementDeFrance d1, DepartementDeFrance d2) {
		// TODO Auto-generated method stub
		return d2.getPopulationDepartement().compareTo(d1.getPopulationDepartement());
	}
	
}
