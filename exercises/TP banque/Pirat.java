package piratage;

import Banque.Client;
import Banque.CompteBancaire;

public class Pirat {

    public static void main (String[] args){
        Client client1 = new Client("idir","gh",29,"22 rue de metz","0689787978");
        CompteBancaire b1 = new CompteBancaire("0001",client1,1000);
        b1.retrait(200);
        System.out.println(b1);
    }


}
