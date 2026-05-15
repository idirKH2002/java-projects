package Banque;
public class Client {
    private String nom ;
    private String prenom ;
    private int age ;
    private String adresse ;
    private String num ;
    public Client (String nom , String prenom , int age ,String adresse , String num ) {
        this.nom = nom ;
        this.prenom = prenom ;
        this.age = age ;
        this.adresse = adresse ;
        this.num = num ;
    }
    public String getNom() {return this.nom = nom;}
    public void setNom(String n) {nom = n ;}
    public String getPrenom() {return this.prenom = prenom;}
    public void setPrenom(String p) {prenom= p ;}
    public int getAge() {return this.age = age;}
    public void setAge(int a) {age = a ;}
    public String getAdresse() {return this.adresse = adresse;}
    public void setAdresse(String ad) {adresse= ad ;}
    public String getNum() {return this.num = num;}
    public void setNum(String no) {num= no;}

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", adresse='" + adresse + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public static void main (String[] args) {
        Client c1 = new Client("jack","albert",26,"44 rue des changes" ,"0778900654");
        System.out.println(c1);

    }
}
