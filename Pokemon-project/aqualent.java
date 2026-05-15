public class aqualent extends aquatique{
    private PokemonWorld monde ;
    public aqualent(String nom, double poid, double taille , int nb_pat , PokemonWorld monde){
        super("z",poid,taille,nb_pat,monde);
    }

    public String getNom() {
        return super.getNom();
    }

    public double getPoid() {
        return super.getPoid();
    }

    public double getTaille() {
        return super.getTaille();
    }

    public int getNbr_pat() {
        return super.getNbr_pat();
    }
    public String toString() {
        return  "Je suis "+super.getNom()+",mon poid est de "+super.getPoid()+" Kg"
                +" ma vitesse actuelle est de "+(super.Vitesse())/2+" km/h,"
                +"j'absorbe quotidiennement une energie de "+super.Energie()+" j'ai "
                + super.getNbr_pat() + " nageoires";
    }
}
