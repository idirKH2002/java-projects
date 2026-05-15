public class Animal {
    public int nbr_pattes;
    public String espece;
    public String couleur;
    public Animal(int nbr_pattes,String espece,String couleur){
        this.nbr_pattes=nbr_pattes;
        this.espece=espece;
        this.couleur=couleur;
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

    @Override
    public String toString() {
        return "~~ description : ~~ \n "+
                "Espece : "+getEspece()+"\n"+
                "couleur : "+getCouleur()+"\n"+
                "nombres de pattes : "+getNbr_pattes();
    }
}
