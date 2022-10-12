package fr.diginamic.banque.entites;

public abstract class Operation {
	private String dateOpe;
	private double mntOpe;
	
	// Constructeur
	public Operation(String dateOpe, double mntOpe) {
		super();
		this.dateOpe = dateOpe;
		this.mntOpe = mntOpe;
	}

	public abstract String getType();
	
	public String getDateOpe() {
		return dateOpe;
	}

	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	public double getMntOpe() {
		return mntOpe;
	}

	public void setMntOpe(double mntOpe) {
		this.mntOpe = mntOpe;
	}
	
	
	
	
}
