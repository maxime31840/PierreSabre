// Ronins.java
package personnages;

public class Ronins extends Humain {
    private int honneur;

    public Ronins(String nom, int argent, int honneur) {
        super(nom, "shochu", argent);
        this.honneur = honneur;
    }

    public void donner(Commerçants beneficiaire) {
        int pourcentageDonner = (int) (argent * 0.1);
        beneficiaire.recevoir(pourcentageDonner);
        perdreArgent(pourcentageDonner);
        parler(nom + " donne " + pourcentageDonner + " sous à Marco.");
    }

    public void provoquer(Yakuzas adversaire) {
        int reputationAdversaire = adversaire.getReputation();
        int forceAdversaire = reputationAdversaire;

        if (honneur * 2 >= forceAdversaire) {
            adversaire.perdreArgent(argent);
            augmenterHonneur();
            parler("Je t'ai eu petit yakusa !");
            parler("J'ai " + argent + " sous de plus et mon honneur est à " + honneur + ".");
        } else {
            perdreArgent(argent);
            honneur--;
            if (honneur < 0) {
                honneur = 0;
            }
            parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
            parler("Mon honneur est à " + honneur + ".");
            adversaire.augmenterReputation();
            adversaire.gagnerArgent(argent);
            adversaire.parler("Ce ronin pensait vraiment battre " + nom + " du clan de " + adversaire.getClan() + " ?");
            adversaire.parler("Je l'ai dépouillé de ses " + argent + " sous. Hi ! Hi !");
        }
    }

    public int getHonneur() {
        return honneur;
    }

    public void augmenterHonneur() {
        honneur++;
    }
}