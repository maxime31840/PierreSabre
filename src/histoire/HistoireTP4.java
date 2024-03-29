// HistoireTP4.java
package histoire;

import personnages.*;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof", 54);
        Commerçants marco = new Commerçants("Marco", 20);
        Yakuzas yakuLeNoir = new Yakuzas("Yaku Le Noir", "whisky", 30, 20, 10);
        Ronins roro = new Ronins("Roro", 60, 1);

        prof.direBonjour();
        prof.boire();
        prof.acheter("boisson", 12);
        prof.parler("J'ai " + prof.getArgent() + " sous.");
        prof.acheter("jeu", 2);
        prof.parler("J'ai " + prof.getArgent() + " sous.");
        prof.acheter("kimono", 50);
        prof.parler("J'ai " + prof.getArgent() + " sous.");

        System.out.println("\n------------------------\n");

        marco.direBonjour();
        marco.seFaireExtorquer();
        roro.donner(marco);
        marco.boire();
        marco.parler("J'ai " + marco.getArgent() + " sous.");

        System.out.println("\n------------------------\n");

        yakuLeNoir.extorquer(marco);
        yakuLeNoir.parler("J'ai " + yakuLeNoir.getArgent() + " sous.");

        System.out.println("\n------------------------\n");

        roro.provoquer(yakuLeNoir);
        yakuLeNoir.parler("J'ai " + yakuLeNoir.getArgent() + " sous.");

        System.out.println("\n------------------------\n");

        yakuLeNoir.setArgent(45);
        roro.provoquer(yakuLeNoir);
        yakuLeNoir.parler("J'ai " + yakuLeNoir.getArgent() + " sous.");
        roro.parler("J'ai " + roro.getArgent() + " sous.");
    }
}