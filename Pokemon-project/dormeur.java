public class dormeur extends Pockemon{
    private int nb_heurs;
    public PokemonWorld monde;
    public dormeur(String nom , double poid , double taille , int nb_pat , int nb_heurs,PokemonWorld monde){
        super(nom,poid,taille,nb_pat);
        this.nb_heurs = nb_heurs;
        this.monde = monde ;
    }

    public double Vitesse() {
        return ( getNbr_pat() * ((getPoid()+1)/10) * 2 * monde.getIntensite() );
    }

    public double Energie (){
        return ((super.getTaille()*super.getTaille()) - (getNb_heurs() * 2));
    }
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

    public int getNb_heurs() {
        return nb_heurs;
    }

    public void setNb_heurs(int nb_heurs) {
        this.nb_heurs = nb_heurs;
    }

    public String toString() {
        return "Je suis "+super.getNom()+",mon poid est de "+super.getPoid()+" Kg"
                +"ma vitesse actuelle est de "+this.Vitesse()+" km/h,"
                +"j'absorbe quotidiennement une energie de "+this.Energie()+" j'ai"
                +super.getNbr_pat()+" pattes,"+"ma taille est de "
                +super.getTaille()+" je dors "+ getNb_heurs();
    }
}
