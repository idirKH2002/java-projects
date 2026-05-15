public class Snack extends Animal{
    public Snack(String couleur){
        super(0,"Serpent",couleur);
    }

    public String getCouleur() {
        return couleur;
    }

    public String getEspece() {
        return espece;
    }

    public int getNbr_pattes() {
        return nbr_pattes;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "~~ description : ~~ \n "+
                "Espece : "+getEspece()+"\n"+
                "couleur : "+getCouleur()+"\n"+
                "nombres de pattes : "+getNbr_pattes();
    }
}
