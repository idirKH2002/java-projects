public class terractif extends Pockemon{
    private double coef_vitalite;
    public PokemonWorld monde;
    public terractif(String nom , double poid , double taille , int nb_pat,double coef_vitalite , PokemonWorld monde){
        super(nom,poid,taille,nb_pat);
        this.coef_vitalite = coef_vitalite;
        this.monde = monde;

    }

    public double Vitesse() {
        return ( getNbr_pat() * ((getPoid()+1)/10) * 2 * monde.getIntensite() );
    }
    public double Energie (){
        return (getCoef_vitalite() * (super.getTaille()*super.getTaille())*100);
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
    public double getCoef_vitalite() {
        return coef_vitalite;
    }
    public void setCoef_vitalite(double coef_vitalite) {
        this.coef_vitalite = coef_vitalite;
    }
    public String toString() {
        return "Je suis "+super.getNom()+",mon poid est de "+super.getPoid()+" Kg"
                +"ma vitesse actuelle est de "+this.Vitesse()+" km/h,"
                +"j'absorbe quotidiennement une energie de "+this.Energie()+" j'ai"
                +super.getNbr_pat()+" pattes,"+"ma taille est de "
                +super.getTaille()+" ma vitalité est de "+getCoef_vitalite() ;
    }
}
