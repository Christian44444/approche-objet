package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, double mntOpe) {
		super(dateOpe, mntOpe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Débit";
	}
	
	
}
