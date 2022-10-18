package fr.diginamic.recensement;

import java.util.Comparator;


public class ComparatorRegionDeFrance implements Comparator<RegionDeFrance> {

	@Override
	public int compare(RegionDeFrance r1, RegionDeFrance r2) {
		// TODO Auto-generated method stub
		return r2.getPopulationRegion().compareTo(r1.getPopulationRegion());
	}

}

