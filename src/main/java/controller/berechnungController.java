package controller;
/**
 * Created by nata on 13.09.2016.
 */
        import data.Passwort;
        import data.TVberechnung;
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
public class berechnungController {

    @FXML
    Button btnZuruckAdminAktion;
@FXML
    Tab tabAdmin;
    @FXML
    TableView fxBerTbl;
    @FXML
    TextField fxBerMngTfld,fxBerPersFaktTfld,fxBerErgbnsTfld;
    @FXML
    ComboBox fxBerProduktCb;

    ////TODO

    public void   onClickZuruckAdminAktion(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) btnZuruckAdminAktion.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        HilfsFunktionen.setzeSprache("Admin",root);
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root));
        stage.setTitle("Insulin APP");
        stage.show();


    }
//    public void   onClickTabAdmin(ActionEvent event) throws IOException {
//        Stage stage = null;
//        Parent root = null;
//        stage = (Stage) tabAdmin.getScene().getWindow();
//        //load up OTHER FXML document
//        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
//        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
//        //create a new scene with root and set the stage
//        stage.setScene(new Scene(root, 600, 400));
//        stage.setTitle("Insulin APP");
//        stage.show();
//
//
//    }
    public void   onClickBerBerechnen(ActionEvent event) throws IOException {
        double perFak;
        double erg;
        ObservableList<TVberechnung> data;
        data =  fxBerTbl.getItems();
        perFak = Double.parseDouble(fxBerPersFaktTfld.getText());
        erg=HilfsFunktionen.macheBerechnung(data,perFak);
        fxBerErgbnsTfld.setText(String.valueOf(erg));
    }


    public void   onClickBerHinzfgn(ActionEvent event) throws IOException {
        ObservableList<TVberechnung> data;
        data =  fxBerTbl.getItems();
        TVberechnung t = new TVberechnung();
        t.setBerMenge(fxBerMngTfld.getText());
        t.setBerProduktname((String)fxBerProduktCb.getValue()); //.getText());
        data.add(t);
        fxBerTbl.setItems(data);
    }
}