public class wolf extends Animal {
    public wolf(String couleur){
        super(4,"loup",couleur);
    }

    public int getNbr_pattes() {
        return nbr_pattes;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getEspece() {
        return espece;
    }

    @Override
    public String toString() {
        return "~~ description : ~~ \n "+
                "Espece : "+getEspece()+"\n"+
                "couleur : "+getCouleur()+"\n"+
                "nombres de pattes : "+getNbr_pattes();
    }
}
