// les classes sont : PockemonWord, Pockemon, terractifs, dormeur, aquatique, aqualent
// la relation : entre Pockemon et terractifs, dormeur, aquatique, aqualen est l'heritage
// on a utilise une heritage entre aquatique et aqualent vu qu'ils sont identique
//La methode main est implementer dans la classe PochemonWord
public class PokemonWorld {
    public double intensite;
    public PokemonWorld(double intensite){
        this.intensite = intensite;
    }
    public void energyLeve() {
        getIntensite();
    }

    public double getIntensite() {
        return intensite;
    }

    public void setIntensite(double intensite) {
        this.intensite = intensite;
    }
    public static void main (String[] args){
        // ici l'utilisateur doit donner l'intensité du monde
        PokemonWorld m1 = new PokemonWorld(1.2);
        terractif p1= new terractif("pika",18,0.85,2,1.1,m1);
        dormeur d1 = new dormeur("hgsfdxj",15,0.9,2,14,m1);
        aquatique a1 = new aquatique("azerty",15,1.5,2,m1);
        aqualent aq1 = new aqualent("qwerty",15,1.5,2,m1);
        //pockemon terractif
        System.out.println(p1);
        //pockemon dormeur
        System.out.println(d1);
        //pockemon aquatique
        System.out.println(a1);
        //pockemon aqualent
        System.out.println(aq1);
    }
}
