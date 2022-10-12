package fr.diginamic.banque.entites;

import java.text.DecimalFormat;

public class TestOperation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cumulOperations = 0;
		
		Operation[] cumulOpe = new Operation[4];
		cumulOpe[0] = new Credit("01/01/2020", 10.45);
		cumulOpe[1] = new Credit("01/01/2021", 20.45);
		cumulOpe[2] = new Debit("01/01/2022", 5);
		cumulOpe[3] = new Debit("01/02/2022", 30);
		
		// for (Operation operation : cumulOpe) {
		// 	 System.out.println(operation);
		// }
		for (int i = 0; i < cumulOpe.length; i++) {
			if (cumulOpe[i].getType() == "Crédit" ) { // Ou (operation[i].getType().equals("Crédit")
				cumulOperations = cumulOperations + cumulOpe[i].getMntOpe(); // ou cumulOperations+=cumulOpe[i]; 	
			}
			else {
				cumulOperations = cumulOperations - cumulOpe[i].getMntOpe();
			}
			  
			System.out.println("Operation du: " + cumulOpe[i].getDateOpe() + " " + cumulOpe[i].getType() + " Montant: " + cumulOpe[i].getMntOpe());
			
		}
		System.out.println("Le cumul des opérations est " + new DecimalFormat("0.00").format(cumulOperations));
	}
	

}
