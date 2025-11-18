package personnages;

public class Samourai extends Humain {
	private String seigneur;

	public Samourai(String nom, int argentamt, String boissonfav, String seigneur) {
		super(nom, argentamt, boissonfav);
		this.seigneur = seigneur;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur "+ seigneur);
	}
	
	public void boire(String boisson) {
		parler("Qu'est ce que je vais chosir comme boisson ? Tiens je vais prendre du " + boisson);
	}
	
}
