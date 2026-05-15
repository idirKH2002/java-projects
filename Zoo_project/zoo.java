import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class zoo {
    public Home[] homes;
    public zoo(Home... homes ){
        this.homes=homes;
    }
    public ArrayList<String> animals_by_color(String couleur) {
        ArrayList<String> liste = new ArrayList<>();
        for (Home maison : homes){
            for (Animal animal:maison.getAnimaux()){
                if (Objects.equals(animal.getCouleur(), couleur)) {
                    liste.add(animal.getEspece());
                }
            }
        }
        return liste;
    }
    public ArrayList<String> animals_by_legs(int nb_pattes){
        ArrayList<String> liste = new ArrayList<>();
        for (Home maison : homes){
            for (Animal animal : maison.getAnimaux()){
                if (animal.getNbr_pattes() == nb_pattes){
                    liste.add(animal.getEspece());
                }
            }
        }
        return liste;
    }
    public int somme(){
        int resultat = 0 ;
        for(Home maison : homes){
            for(Animal animal : maison.getAnimaux()){
                resultat += animal.getNbr_pattes();
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        return "zoo{" +
                "homes=" + Arrays.toString(homes) +
                '}';
    }

    public static void main(String[] args) {

        wolf loup1 = new wolf("noir");
        System.out.println(loup1);
        Sheep mou1 = new Sheep("noir");
        System.out.println(mou1);
        Snack s = new Snack("noir");
        System.out.println(s);
        Parot p =new Parot("noir");
        System.out.println(p);
        Home maison = new Home("B8");
        Home maison2 = new Home("akham");
        maison.add(p,s,loup1);
        System.out.println(maison);
        maison2.add(loup1);
        maison2.add(mou1);
        zoo z=new zoo(maison,maison2);
        System.out.println(z.animals_by_color("noir"));
        System.out.println(z.animals_by_legs(4));
        System.out.println(z.somme());
    }


}