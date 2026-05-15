public class Client {
    private String nom;
    private String prenom;
    private String date_naissance;
    public Client(String nom , String prenom , String date_naissance){
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public String getDate_naissance() {
        return date_naissance;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setDate_naissance(String date_naissance) {
        this.date_naissance = date_naissance;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_naissance='" + date_naissance + '\'' +
                '}';
    }
}
