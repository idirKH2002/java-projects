public class aquatique extends Pockemon{
    public PokemonWorld monde;
    public aquatique(String nom , double poid , double taille , int nb_pat , PokemonWorld monde){
        super(nom,poid,taille,nb_pat);
        this.monde = monde ;
    }

    public double Vitesse() {
        return ( getNbr_pat() * (getPoid()/25) * 2 * monde.getIntensite() );
    }

    public double Energie(){
        return(super.getPoid() /2);
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public double getPoid() {
        return super.getPoid();
    }

    @Override
    public double getTaille() {
        return super.getTaille();
    }

    @Override
    public int getNbr_pat() {
        return super.getNbr_pat();
    }
    public String toString() {
        return "Je suis "+super.getNom()+",mon poid est de "+super.getPoid()+" Kg"
                +" ma vitesse actuelle est de "+this.Vitesse()+" km/h,"
                +"j'absorbe quotidiennement une energie de "+this.Energie()+" j'ai "
                + super.getNbr_pat() + " nageoires";
    }
}
