package controller;

import data.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;

import data.HilfsFunktionen;

/**
 * Created by nata on 09.09.2016.
 */
public class passwortController09 {
    @FXML
    Button fxPsswdBtn;
    @FXML
    Button fxPsswZrckBtn;
    @FXML
    PasswordField flPasswort;
////TODO
public void onClickPasswort(ActionEvent event) throws IOException {
    Stage stage = null;
    Parent root = null;
    final Passwort pass = new Passwort("2309");
//TODO
    if (event.getSource() == fxPsswdBtn & pass.getKod().equals(flPasswort.getText())) {
//    if (event.getSource() == btnPasswort ){
        stage = (Stage) fxPsswdBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("Profil_Produkt.fxml"));
        HilfsFunktionen.setzeSprache("NeuesProdukt",root);
        HilfsFunktionen.ladeProfil(root);
        HilfsFunktionen.ladeNeuProdukt(root);
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();
    }
}



     public void onClickZurueck(ActionEvent event) throws IOException {
         Stage stage = null;
         Parent root = null;
         stage = (Stage) fxPsswZrckBtn.getScene().getWindow();
         //load up OTHER FXML document
         root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
         HilfsFunktionen.setzeSprache("Admin",root);
         //create a new scene with root and set the stage
                stage.setScene(new Scene(root));
        stage.setTitle("Insulin APP");
        stage.show();


    }


}



