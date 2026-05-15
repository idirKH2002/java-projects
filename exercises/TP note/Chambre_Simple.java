public class Chambre_Simple extends chambre{
    public Chambre_Simple(int num,String cap,int prix){
        super(num,cap,prix);
        super.cap="1 couchage";
        super.prix=50;
    }
    public int getNum() {
        return super.getNum();
    }
    public int getPrix() {
        return super.getPrix();
    }
    public String getCap() {
        return super.getCap();
    }
    public void setNum(int num) {
        super.setNum(num);
    }
    public String toString() {
        return super.toString();
    }
}
