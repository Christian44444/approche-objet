package fr.diginamic.maison;

public class Maison {
	protected Piece[] p1 = new Piece[0];
	
	public void ajouterPiece(Piece piece) {
		if (piece != null) {
			if (piece.getNumeroEtage() >= 0) {
				if (piece.getSuperficie() >= 0) {
					
					Piece[] tabBean = new Piece[p1.length + 1];
					
					System.arraycopy(p1, 0, tabBean, 0, p1.length);
					tabBean[tabBean.length - 1] = piece;
					p1 = tabBean;
				} else {
					System.out.println("La superficie de la pièce est négatif! \nElle n'a pas été prise en compte ");
				}
			} else {
				System.out.println("Le numéro d'étage de la pièce est négatif! \nElle n'a pas été prise en compte ");
			}
		} else {
			System.out.println("Vous avez passez une pièce non initialisée!" + "\n" + "Elle n'a pas été prise en compte.");
		}
		
	}
	
	public double superficieTypePiece(Piece tPiece) {
		double superficieTypePiece = 0;
		for (Piece pieces : p1) {
			if (tPiece.getClass().equals(pieces.getClass()))  {
				superficieTypePiece+=pieces.getSuperficie();
			}
		}
		return superficieTypePiece;
	}
	
	public int nombreTypePiece(Piece tPiece) {
		int nbTypePiece = 0;
		for (Piece pieces : p1) {
			if (tPiece.getClass().equals(pieces.getClass()))  {
				nbTypePiece++;
			}
		}
		return nbTypePiece;
	}
	
	public double superficieMaison() {
		double superficieTotale = 0;
		for (Piece piece : p1) {
			superficieTotale+=piece.getSuperficie();
		}
		return superficieTotale;
	}
	
	public double superficieEtage(int etage) {
		double superficieEtage = 0;
		for (Piece piece : p1) {
			if (piece.getNumeroEtage() == etage) {
				superficieEtage+=piece.getSuperficie();
			}
		}
		return superficieEtage;
	}
	

}
