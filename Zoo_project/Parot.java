public class Parot extends Animal {
    public Parot(String couleur){
        super(2,"perroquet",couleur);
    }

    public int getNbr_pattes() {
        return nbr_pattes;
    }

    public String getEspece() {
        return espece;
    }

    public String getCouleur() {
        return couleur;
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
