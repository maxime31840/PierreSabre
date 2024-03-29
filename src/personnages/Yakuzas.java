package personnages;

public class Yakuzas extends Humain {
    private String clan;
    private int reputation;
    private int honneur;

    public Yakuzas(String nom, String clan, int argent, int reputation, int honneur) {
        super(nom, "whisky", argent);
        this.clan = clan;
        this.reputation = reputation;
        this.honneur = honneur;
    }

    public String getClan() {
        return clan;
    }

    public void extorquer(Commerçants victime) {
        int argentVolé = victime.seFaireExtorquer();
        gagnerArgent(argentVolé);
        parler("J'ai piqué " + argentVolé + " sous à " + victime.getNom() + ". Hi ! Hi !");
        parler("Je suis " + clan + " et j'ai maintenant " + argent + " sous.");
    }

    public void provoquer(Ronins adversaire) {
        int honneurAdversaire = adversaire.getHonneur();
        int forceAdversaire = honneurAdversaire * 2;

        if (forceAdversaire >= reputation) {
            adversaire.gagnerArgent(argent);
            adversaire.augmenterHonneur();
            perdreArgent(argent);
            parler("J'ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + ".");
        } else {
            perdreArgent(argent);
            parler("J'ai perdu mon duel et mes " + argent + " sous, snif...");
            this.honneur--;
            if (honneur < 0) {
                honneur = 0;
            }
            parler("Mon honneur est maintenant de " + honneur + ".");
        }
    }

    public int getReputation() {
        return reputation;
    }
    
    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void augmenterReputation() {
        reputation++;
    }

    public int getHonneur() {
        return honneur;
    }
}