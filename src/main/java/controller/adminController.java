package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by nata on 08.09.2016.
 */
public class adminController {
    @FXML
    Button btnAdmin;
    @FXML
    Button btnUser;
    public void onClickRoleWindow(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        if(event.getSource()== btnAdmin){
            //get reference to the button's stage
            stage = (Stage) btnAdmin.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Passwort08.fxml"));
        }
        if(event.getSource()== btnUser){
            //get reference to the button's stage
            stage = (Stage) btnUser.getScene().getWindow();
            //load up OTHER FXML document
            root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Berechnen.fxml"));
        }
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 600));
        stage.setTitle("Insulin APP");
        stage.show();
    }


}
