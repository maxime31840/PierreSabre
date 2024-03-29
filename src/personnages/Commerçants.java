package personnages;

public class Commerçants extends Humain {
    public Commerçants(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int argentPerdu = argent;
        argent = 0;
        parler("J'ai tout perdu ! Le monde est trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argentReçu) {
        this.argent += argentReçu;
        parler("Je n'arrive pas à y croire, j'ai " + this.argent + " sous ! Merci généreux donateur !");
    }
}