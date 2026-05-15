package Banque;

public class Agence {
    public static void main (String[] args) {
        Client c1 = new Client("jack", "albert", 26, "44 rue des changes", "0778900654");
        Client c2 = new Client("marie","sophie" ,23,"1 rue de metz","0456594843");
        CompteBancaire b1 = new CompteBancaire("01",c1);
        CompteBancaire b2 = new CompteBancaire("02",c2,500);
        b1.versement(100);
        b2.retrait(500);
        b2.viremment(500,b1);
        System.out.println(b1);
        System.out.println(b2);

    }
}
