public class Bibliotheque {
    public static void main (String[] args){
        Document d1 = new Document("toulouse");
        Document d2 = new Document("Capitole");
        Document d44 = new Document("jhgfghjk");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d44);
        Livre l1 = new Livre("SMlkjh","MAC",209);
        System.out.println(l1);
        Dictionnaire dict1 = new Dictionnaire("le bon","francais",20);
        System.out.println(dict1);


    }

}
