package personnages;

public class Yakuza extends Humain {
	private String clan;
    private int reputation=0;
	public Yakuza(String nom, int argentamt, String boissonfav, String clan) {
		super(nom, argentamt, boissonfav);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		parler("Tiens tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+ ", si tu tiens à la vie donne moi ta bourse !");
		int argent=victime.seFaireExtorquer();
		gagnerArgent(argent);
		reputation++;
		parler("J'ai piqué les "+ argent+ "sous de " + victime.getNom()+ ", ce qui me fait "+ getArgentamt()+ "sous dans ma poche. Hi ! Hi !");
		
	}
	public int perdre() {
	   int argentPerdu = getArgentamt();
	   reputation--;
	   perdreArgent(argentPerdu);
	   parler("J’ai perdu mon duel et mes " + argentPerdu + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
	   return argentPerdu;
	}

	public void gagner(int gain) {
	   gagnerArgent(gain);
	   reputation++;
	   parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan +
	   " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}

	public int getReputation() {
	    return reputation;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);
	}
	
	
}
	

