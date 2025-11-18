package personnages;

public class Traitre extends Samourai {
	private int niveauTraitrise;

	public Traitre(String nom, int argentamt, String boissonfav, String seigneur, int niveauTraitrise) {
		super(nom, argentamt, boissonfav, seigneur);
		this.niveauTraitrise = 0;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : "+ niveauTraitrise + ".Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if(niveauTraitrise>=3) {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
		else {
			int argentCommercant = commercant.getArgentamt();
			int argentRanconner = argentCommercant *2/10;
			commercant.perdreArgent(argentRanconner);
			this.gagnerArgent(argentRanconner);
			niveauTraitrise++;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer! Donne-moi"+ argentRanconner+ "sous ou gare à toi");
			commercant.parler("Tout de suite grand "+ this.getNom() + ".");
		}
	}
	
	
}
