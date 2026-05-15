public class Document {
    private String titre;
    public static int numero;
    public Document(String titre){
        this.titre = titre ;
        this.numero=1;
    }
    public String getTitre() {
        return titre;
    }

    public static int getNumero() {
        return numero++;
    }

    @Override
    public String toString() {
        return "Document { " +
                "titre='" + getTitre() +  " -  " +
                "Numero=" + getNumero()+ '}';
    }

    /* On a pas besoin de manipulateur (Set()) car
             on peu plus le changer une fois on l'a entré */

}
