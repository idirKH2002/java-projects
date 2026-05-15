public class Chambre_Double extends chambre{
    public Chambre_Double (int num , String cap , int prix){
        super(num,cap,prix);
        super.cap = "2 couchage";
        super.prix = 100;
    }
    public String toString() {
        return super.toString();
    }
}
