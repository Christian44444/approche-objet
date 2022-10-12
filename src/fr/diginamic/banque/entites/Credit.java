package fr.diginamic.banque.entites;

public class Credit extends Operation{
		
	public Credit(String dateOpe, double mntOpe) {
		super(dateOpe, mntOpe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Crédit";
		
	}

}
