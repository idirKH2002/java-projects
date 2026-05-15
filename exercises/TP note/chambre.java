public class chambre {
    public int num;
    public String cap;
    public int prix;
    public chambre(int num,String cap , int prix){
        this.num = num;
        this.cap = cap;
        this.prix = prix;
    }
    public int getNum() {
        return num;
    }
    public String getCap() {
        return cap;
    }
    public int getPrix() {
        return prix;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setCap(String cap) {
        this.cap = cap;
    }
    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "chambre {" +
                " num = " + getNum() +
                ", cap = " + getCap() +
                ", prix = " + getPrix() +
                '}';
    }
}
