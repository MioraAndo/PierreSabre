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
	public void provoquer(Yakuza adversaire) {
        parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
        int force = honneur * 2;

        if (force >= adversaire.getReputation()) {
            int argentGagne = adversaire.perdre();
            gagnerArgent(argentGagne);
            honneur++;
            parler("Je t’ai eu petit yakusa!");
        } else {
            int argentPerdu = getArgentamt();
            adversaire.gagner(argentPerdu);
            perdreArgent(argentPerdu);
            honneur--;
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
        }
    }

}
