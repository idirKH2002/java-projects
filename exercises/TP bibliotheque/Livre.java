public class Livre extends Document {
    private String auteur;
    private int nbPages;
    public Livre(String titre, String auteur , int nbPages ){
        super(titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }
    public String getAuteur() {
        return auteur;
    }
    public String getTitre() {
        return super.getTitre();
    }
    public int getNbPages() {
        return nbPages;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    @Override
    public String toString() {
        return "Livre { " + " titre ='" +super.getTitre()+ "'"+
                " , auteur='" + auteur + '\'' +
                ", nbPages=" + nbPages +
                '}';
    }
}
