package controller;
//
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
//
//

// * Created by nata on 09.09.2016.
//

public class adminAktioncontroller {
    @FXML
    Button btnProfil;
    @FXML
    Button btnProdukt;
       @FXML
            Button btnZuruckAdmin;

    Stage stage = null;
    Parent root = null;

    public void onClickAdminAction(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        if (event.getSource() == btnProfil) {

            stage = (Stage) btnProfil.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Profil_Produkt.fxml"));
        }
        if (event.getSource() == btnProdukt) {
            stage = (Stage) btnProdukt.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("Profil_Produkt.fxml"));
        }

        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();
    }
    public void onClickZuruckAdmin(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) btnZuruckAdmin.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();
 }

    }




