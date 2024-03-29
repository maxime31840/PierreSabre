package personnages;

public class Commerçants extends Humain {
	
    public Commerçants(String nom, int argent) {
        super(nom,"thé",argent);
    }
    
    public int seFaireExtorquer(int argent) {
    	int ancienneVal = argent;
        perdreArgent(argent);
        System.out.println(" le monde est vraiment trop injuste.");
        return ancienneVal;
    }
    
    protected void recevoirArgent(int argent) {
        gagnerArgent(argent);
        System.out.println("Merci beaucoup !");
    }
}