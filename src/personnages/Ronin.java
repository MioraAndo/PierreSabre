package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	
	public Ronin(String nom, int argentamt, String boissonfav) {
		super(nom, argentamt, boissonfav);
	}


	public void donner(Commercant beneficiaire) {
		int don = getArgentamt()/10;
		parler(beneficiaire.getNom() + " prend ces " + don + " sous");
		beneficiaire.recevoir(don);
		
	}

}
