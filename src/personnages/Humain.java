package personnages;

public class Humain {
	private String nom;
	private int Argentamt;
	private String Boissonfav;
	protected int nbConnaissance;
	protected Humain[] memoire;
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
		this.memoire = new Humain[30];
		this.nbConnaissance=0;
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
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.direBonjour();
		this.memoriser(autreHumain);
		autreHumain.memoriser(this);
		
		
	}
	
	protected void memoriser(Humain human) {
		if(nbConnaissance <memoire.length) {
			memoire[nbConnaissance]= human;
			nbConnaissance++;
		}
		else {
			for(int i=0;i<memoire.length;i++) {
				memoire[i-1]= memoire[i];
			}
			memoire[memoire.length-1]= human;
		}
	}
	
	public void listerConnaissance() {
		if(nbConnaissance==0) {
			parler("bro doesn't know anyone, that's sad ");
		}
		else {
			String name ="Je connais beuacoup de monde dont : ";
			for(int i=0;i<memoire.length;i++) {
				name +=memoire[i].getNom();
				if(i<nbConnaissance-1) {
					name+=" , ";
				}
			}
			parler(name);
		}
	}	
}
