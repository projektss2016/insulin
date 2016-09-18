package controller;

/**
 * Created by nata on 13.09.2016.
 */
        import data.Passwort;
        import data.TVneuesProdukt;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Parent;
        import javafx.scene.Scene;
        import javafx.scene.control.*;
        import javafx.stage.Stage;

        import java.io.IOException;
        import java.util.Arrays;

        import data.HilfsFunktionen;

/**
 * Created by nata on 09.09.2016.
 */
public class newProduktcontroller {

    @FXML
    Button fxNeuProduktZrckBtn;
    @FXML
    Button fxNeuProduktSpchrnBtn;
    @FXML
    TextField fxPrflMrgnTfld,fxPrflAbndTfld,fxPrflGwchtTfld,fxPrflPersFkTfld;
    @FXML
    TextField fxNeuProduktTfld,fxNeuProduktKhlnHydrTfld;
    @FXML
    TableView fxNeuProduktTbl;
    ////TODO

    public void onClickProduktSpeichen(ActionEvent event) throws IOException {
        /*
        Stage stage = null;
        Parent root = null;



        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        HilfsFunktionen.setzeSprache("Admin",root);
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();
        */
        ObservableList<TVneuesProdukt> data;
        data =  fxNeuProduktTbl.getItems();
        TVneuesProdukt t = new TVneuesProdukt();
        t.setProduktname(fxNeuProduktTfld.getText());
        t.setKohlenhydrate(fxNeuProduktKhlnHydrTfld.getText());
        data.add(t);
        fxNeuProduktTbl.setItems(data);

    }

    public void onClickZuruck(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) fxNeuProduktZrckBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        HilfsFunktionen.setzeSprache("Admin",root);
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();


    }
    public void onClickProfilSpeichern(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        String mDos, aDos, gewicht, perFak;
        mDos = fxPrflMrgnTfld.getText();
        aDos = fxPrflAbndTfld.getText();
        gewicht = fxPrflGwchtTfld.getText();
        perFak = fxPrflPersFkTfld.getText();
        HilfsFunktionen.speichereProfil(mDos, aDos, gewicht, perFak);

        stage = (Stage) fxNeuProduktSpchrnBtn.getScene().getWindow();

        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        HilfsFunktionen.setzeSprache("Admin", root);
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();
    }
}