package data;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by flora on 18.09.2016.
 */
public class TVberechnung {
    private SimpleStringProperty berProduktname = new SimpleStringProperty("");
    private SimpleStringProperty berMenge = new SimpleStringProperty("");

    public TVberechnung() {

    }

    public TVberechnung(SimpleStringProperty berProduktname, SimpleStringProperty berMenge) {
        this.berProduktname = berProduktname;
        this.berMenge = berMenge;
    }

    public String getBerProduktname() {
        return berProduktname.get();
    }

    public SimpleStringProperty berProduktnameProperty() {
        return berProduktname;
    }

    public void setBerProduktname(String berProduktname) {
        this.berProduktname.set(berProduktname);
    }

    public String getBerMenge() {
        return berMenge.get();
    }

    public SimpleStringProperty berMengeProperty() {
        return berMenge;
    }

    public void setBerMenge(String berMenge) {
        this.berMenge.set(berMenge);
    }
}
