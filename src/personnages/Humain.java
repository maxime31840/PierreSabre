// Humain.java
package personnages;

public class Humain {
    protected String nom;
    protected String boisson;
    protected int argent;
    protected int nbConnaissance = 0;
    private Humain[] TabConnaissance = new Humain[30];
	

    public Humain(String nom, String boisson, int argent) {
        this.nom = nom;
        this.boisson = boisson;
        this.argent = argent;
    }

    public Humain(String nom, int argent) {
        this.nom = nom;
        this.boisson = "thé";
        this.argent = argent;
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public String getBoisson() {
        return boisson;
    }

    public void direBonjour() {
        parler("Bonjour, Je m'appelle " + nom + " et j'aime boire du " + boisson + ".");
    }

    public void boire() {
        parler("Mmm, un bon verre de " + boisson + "! Gloups !");
    }

    public void parler(String texte) {
        System.out.println("L'humain " + nom + " : " + texte + ".");
    }

    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            System.out.println("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous.");
            perdreArgent(prix);
        } else {
            System.out.println("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
        }
    }

    protected void gagnerArgent(int gain) {
        this.argent += gain;
    }

    protected void perdreArgent(int perte) {
        this.argent -= perte;
    }
    
    public void faireConnaissanceAvec(Humain connaissance) {
    	this.repondre(connaissance);
        connaissance.repondre(this);
    }
    
    private void memoriser(Humain connaissance) {
        if (nbConnaissance < 30) {
            TabConnaissance[nbConnaissance++] = connaissance;
        }
    }
    
    public void repondre(Humain connaissance) {
        direBonjour();
        connaissance.memoriser(this);
    }
    
    public void listerConnaissance() {
        System.out.println("Liste des connaissances de " + nom + ":");
        for (int i = 0; i < nbConnaissance; i++) {
            if (TabConnaissance[i] != null) {
                System.out.println((i + 1) + ". " + TabConnaissance[i].getNom());
            }
        }
    }
}