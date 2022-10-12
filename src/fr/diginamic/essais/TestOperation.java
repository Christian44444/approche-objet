package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Operations.calcul(5, 10, ""));
		System.out.println(Operations.calcul(5, 0, "/"));
		System.out.println(Operations.calcul(5, 10, "+"));
		System.out.println(Operations.calcul(5, 10, "-"));
		System.out.println(Operations.calcul(5, 10, "*"));
		System.out.println(Operations.calcul(5, 10, "/"));
		
	}

}
