package personnages;

public class Humain {
	private String nom;
	private String boisson;
	private int argent;
	
	
	public Humain(String nom,String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson(){
		return boisson;
	}
	
	public void direBonjour() {
		parler("Bonjour, Je m'apelle " + nom + " et j'aime boire du " + boisson+".");
		
	}
	
	public void boire() {
		parler("Mmm, un bon verre de " + boisson + "! Gloups !");
	}
	
	
	public void parler(String texte) {
		System.out.println("L'humain " + nom + " : " + texte +".");
	}
	
	public void acheter(String bien, int prix) {
        if (argent >= prix) {
        	System.out.println("J ai " + argent + " sous en poche. Je vais pouvoir m'offrir " +bien+  " à "  +prix+ " sous");
            perdreArgent(prix);
        } else {
            System.out.println("Je n'ai plus que " +argent+ " sous en poche. Je ne peux même pas m'offrir " +bien+ " à " +prix+ " sous.");
        }
	}
	
    public void gagnerArgent(int gain) {
        this.argent += gain;
    }

    public void perdreArgent(int perte) {
        this.argent -= perte;
    }
}


