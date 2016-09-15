package data;

/**
 * Created by nata on 12.09.2016.
 */
public class Produkt {

    private  String produktName;
    private int produktFaktor;

    public Produkt(String produktName, int produktFaktor) {
        this.produktName= produktName;
//        this.produktFaktor = produktFaktor;
    }

    public String getProduktName() {
        return produktName;
    }
    public void setProduktName(String produktName) {
        this.produktName = produktName;
    }


//    public int getProduktFaktor() {
//        return produktFaktor;
//    }
//    public void setProduktFaktor(int produktFaktor) {
//        this.produktFaktor = produktFaktor;
//    }

}