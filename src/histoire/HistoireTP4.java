package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", 54,"kombucha");
		prof.direBonjour();
		prof.acheter("kombucha", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
	}
}
