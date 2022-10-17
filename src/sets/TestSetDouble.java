package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);
		set.add(8.25);
		set.add(-7.32);
		set.add(13.3);
		set.add(-12.45);
		set.add(48.5);
		set.add(0.01);
		
		Double max = null;
		
		for (Double double1 : set) {
			System.out.println(double1);
			if (max == null) {
				max = double1;
			} else if (max < double1) {
				max = double1; 				
			}
		}
		System.out.println("Max " + max);
		// reste le remove
		
		
	}

}
