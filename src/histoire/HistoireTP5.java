package histoire;

import personnages.*;

public class HistoireTP5 {

	public static void main(String[] args) {
		Commerçants marco = new Commerçants("Marco", 20);
		Commerçants chonin = new Commerçants("Chonin", 40);
		Commerçants kumi = new Commerçants("Kumi", 10);
		Yakuzas yakuLeNoir = new Yakuzas("Yaku Le Noir", "Warsong", 30, 20, 10);
		Ronins roro = new Ronins("Roro",100,60);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yakuLeNoir);
		chonin.faireConnaissanceAvec(marco);
		kumi.faireConnaissanceAvec(marco);
		roro.listerConnaissance();
		yakuLeNoir.listerConnaissance();
		
	}

}
