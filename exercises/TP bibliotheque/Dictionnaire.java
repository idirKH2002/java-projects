public class Dictionnaire extends Document{
    public String langue ;
    public int nbTomes ;
    public Dictionnaire(String titre,String langue,int nbTomes){
        super(titre);
        this.langue=langue;
        this.nbTomes=nbTomes;
    }

    public int getNbTomes() {
        return nbTomes;
    }

    public String getLangue() {
        return langue;
    }
    public void setLangue(String langue) {
        this.langue = langue;
    }

    public void setNbTomes(int nbTomes) {
        this.nbTomes = nbTomes;
    }

    @Override
    public String getTitre() {
        return super.getTitre();
    }

    @Override
    public String toString() {
        return "Dictionnaire { " +
                " titre = '" + super.getTitre() + "'"+
                " , langue = '" + getLangue()+ '\'' +
                " , nbTomes= " + getNbTomes() +
                '}';
    }
}
