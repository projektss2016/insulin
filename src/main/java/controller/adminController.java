package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

//fuer die Sprache
import static controller.MainController.rbSprache;

/**
 * Created by nata on 08.09.2016.
 */
public class adminController {
    @FXML
    Button btnAdmin;
    @FXML
    Button btnUser;
    @FXML
    Button btnZuruckStart;


    public void onClickRoleWindow(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
//        TODO  do case statt if
        if(event.getSource()== btnAdmin){
            //get reference to the button's stage
            stage = (Stage) btnAdmin.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Passwort08.fxml"));
            //hier buttons und labels setzen von w_Passwort08.fxml - rbSprache kommt aus MainController
            ((Label)root.lookup("#IdGebenSieBittePwd")).setText(rbSprache.getString("IdGebenSieBittePwd"));

            stage.setScene(new Scene(root, 300, 300));
        }
        if(event.getSource()== btnUser){
            //get reference to the button's stage
            stage = (Stage) btnUser.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Berechnung.fxml"));
            //hier buttons und labels setzen von w_Berechnen.fxml
            stage.setScene(new Scene(root, 700, 500));
        }}

    public void   onClickRoleWindowZuruck(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) btnZuruckStart.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_start08.fxml"));
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();


//        TODO zurück
//    public void onClickRoleWindowZuruck(ActionEvent event) throws IOException {
//        Stage stage = null;
//        Parent root = null;
//        if (event.getSource() == btnZuruckStart) {
//            //get reference to the button's stage
//            stage = (Stage) btnZuruckStart.getScene().getWindow();
//            //load up OTHER FXML document
//            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_start08.fxml"));
//            stage.setScene(new Scene(root, 500, 500));
//

            //create a new scene with root and set the stage
            // stage.setScene(new Scene(root, 300, 300));
//            stage.setTitle("Insulin APP");
//            stage.show();
        }
    }


