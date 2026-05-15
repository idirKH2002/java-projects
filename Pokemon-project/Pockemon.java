public class Pockemon {
    private String nom;
    private double poid;
    private double taille;
    private int nbr_pat;
    public Pockemon(String nom , double poid , double taille , int nbr_pat ){
        this.nom = nom ;
        this.poid = poid;
        this.taille = taille;
        this.nbr_pat = nbr_pat;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public int getNbr_pat() {
        return nbr_pat;
    }

    public void setNbr_pat(int nbr_pat) {
        this.nbr_pat = nbr_pat;
    }

    @Override
    public String toString() {
        return "Je suis" + nom + '\'' +
                "mon poid est de " + poid +
                "ma taille" + taille +
                "j'ai=" + nbr_pat ;
    }
}

