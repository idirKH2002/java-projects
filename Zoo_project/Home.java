import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {
    private String nom ;
    private ArrayList<Animal> animaux;
    public Home(String nom){
        this.nom=nom;
        this.animaux=new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public void add(Animal... animal){
        for (Animal a : animal ){
            animaux.add(a);
        }
    }

    public ArrayList<Animal> getAnimaux() {
        return animaux ;
    }


    @Override
    public String toString() {
        ArrayList<String> resultat ;
        resultat = new ArrayList<>();
        for (Animal animal : getAnimaux()){
             resultat.add(animal.getEspece());
        }

        return "Home { \n" +
                "nom= " + getNom() +"\n"  +
                "animaux = " +resultat+
                '}';
    }
}
