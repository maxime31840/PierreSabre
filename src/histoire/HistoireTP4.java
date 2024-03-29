package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		
		Humain Prof = new Humain("Prof","Kamboucha",54);
		Prof.direBonjour();
		Prof.acheter("Kamboucha",12);
		Prof.boire();
		Prof.acheter("jeu", 2);
		Prof.acheter("Kimono", 50);
	}
}
