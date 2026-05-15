package Banque;

public class CompteBancaire {
    private String numero ;
    private Client client;
    private double solde;

    public CompteBancaire(String numero, Client client , double solde){
        this.numero = numero ;
        this.client = client ;
        this.solde = solde ;
    }
    public CompteBancaire(String numero, Client client){
        this.numero = numero ;
        this.client = client ;
        this.solde = 0 ;
    }

    public String getNumero() {
        return this.numero = numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Client getClient() {
        return this.client = client ;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getSolde() {
        return this.solde = solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void versement(double montant){
        setSolde(getSolde()+montant);
    }
    public void retrait (double montant){
        if (montant>getSolde()) {
            System.out.println("Solde insufisant !");
        }
        else {
            setSolde(getSolde() - montant);
        }
    }
    public void viremment(double montant , CompteBancaire compte){
        if (getSolde()<montant) {
            System.out.println("Solde insufisant !");
        }
        else {
            setSolde(getSolde()-montant);
            compte.setSolde(compte.getSolde()+montant);
        }
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numero='" + getNumero() + '\'' +
                ", client=" + getClient() +
                ", solde=" + getSolde() +
                '}';
    }
}
