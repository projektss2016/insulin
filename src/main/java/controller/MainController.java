package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by nata on 06.09.2016.
 */
public class MainController implements Initializable {
    public static ResourceBundle rbSprache;
    Locale locSprache;
    static String sprache = "de";
    // @FXML
    // Button btnStart;
    @FXML
    Label label;
    @FXML
    Button btnDE;
    @FXML
    Button btnRU;
    @FXML
    ResourceBundle resourceBundle;

    public void onClick(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

//        if(event.getSource()== btnStart){
//            //get reference to the button's stage
//            stage = (Stage) btnStart.getScene().getWindow();
//            //load up OTHER FXML document
//            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml")); //w_Admin08
//        }
        if (event.getSource()== btnDE) {
              sprache = "de";
            locSprache = new Locale("de","DE");
            rbSprache = ResourceBundle.getBundle("bundles.bundle",locSprache); //bundles ist das Verzeichnis
                                                                               //bundle ist der Dateiname
                                                                               //bundle_de.properties -> nur bundle wird
                                                                               //genommen, der "_" wird automatisch gemacht

            stage = (Stage) btnDE.getScene().getWindow();
            //load up OTHER FXML document
          root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        }
        if (event.getSource()== btnRU) {
              sprache = "ru";

            locSprache = new Locale("ru","RU");
            rbSprache = ResourceBundle.getBundle("bundles.bundle",locSprache); //bundles ist das Verzeichnis
            //bundle ist der Dateiname
            //bundle_de.properties -> nur bundle wird
            //genommen, der "_" wird automatisch gemacht
            stage = (Stage) btnRU.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        }

        //Sprache setzen für w_Admin0909.fxml
        ((Label)root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //((Button)root.lookup("#btnAdmin")).setText(rbSprache.getString("btnAdmin"));
        //((Button)root.lookup("#btnUser")).setText(rbSprache.getString("btnUser"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root));
        stage.setTitle("Insulin APP");
        stage.show();
    }



    public void initialize(URL location, ResourceBundle resources) {
//        this.resourceBundle = ResourceBundle.getBundle("bundles.bundle", new Locale("de"));
    }
}
