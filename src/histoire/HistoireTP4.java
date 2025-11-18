package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", 54,"kombucha");
		prof.direBonjour();
		prof.acheter("kombucha", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		Yakuza yaku = new Yakuza("Yaku le Noir", 30, "whisky", "Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
		
		Ronin roro = new Ronin("Roro", 60, "shochu");
		roro.direBonjour();
		roro.donner(marco);
		
		roro.provoquer(yaku);
		
	}
}
