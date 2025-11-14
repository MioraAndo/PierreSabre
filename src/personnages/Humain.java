package personnages;

public class Humain {
	private String nom;
	private int Argentamt;
	private String Boissonfav;
	public String getNom() {
		return nom;
	}
	public int getArgentamt() {
		return Argentamt;
	}
	
	public Humain(String nom, int argentamt, String boissonfav) {
		this.nom = nom;
		Argentamt = argentamt;
		Boissonfav = boissonfav;
	}
	protected void parler(String texte) {
		System.out.println("(" +nom+")"+texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + Boissonfav);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + Boissonfav + " ! GLOUPS ! ");
	}
	
	public void acheter(String bien, int prix){
		if(Argentamt>=prix) {
			parler("j'ai "+ Argentamt + " sous en poche. Je vais m'offrir " + bien + " à " + prix );
		}
		else {
			parler("Je n'ai plus que "+ Argentamt + " sous en poche. Je ne peux même pas m'offrir un"+ bien + " à " + prix + " sous");
		}
	}
	
	protected void gagnerArgent(int gain) {
		Argentamt+=gain;
	}
	
	protected void perdreArgent(int perte) {
		Argentamt-=perte;
	}
	
	
	
	
}
