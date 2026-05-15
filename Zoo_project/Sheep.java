public class Sheep extends Animal {
    public Sheep(String couleur){
        super(4,"mouton",couleur);
    }

    public String getEspece() {
        return espece;
    }

    public String getCouleur() {
        return couleur;
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
