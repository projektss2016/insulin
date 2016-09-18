package data;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by flora on 18.09.2016.
 */
public class TVneuesProdukt {
    private SimpleStringProperty produktname = new SimpleStringProperty("");
    private SimpleStringProperty kohlenhydrate = new SimpleStringProperty("");

    public TVneuesProdukt(SimpleStringProperty produktname, SimpleStringProperty kohlenhydrate) {
        this.produktname = produktname;
        this.kohlenhydrate = kohlenhydrate;
    }

    public TVneuesProdukt() {
    }

    public String getProduktname() {
        return produktname.get();
    }

    public void setProduktname(String produktname) {
        this.produktname.set(produktname);
    }

    public String getKohlenhydrate() {
        return kohlenhydrate.get();
    }

    public SimpleStringProperty kohlenhydrateProperty() {
        return kohlenhydrate;
    }

    public void setKohlenhydrate(String kohlenhydrate) {
        this.kohlenhydrate.set(kohlenhydrate);
    }

    public SimpleStringProperty produktnameProperty() {
        return produktname;
    }
}
