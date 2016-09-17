package controller;

import data.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by nata on 06.09.2016.
 */
public class profilController09 implements Initializable {
    @FXML
    Button test3btn;
    Label labelName;
    Label labelPersonFaktor;
    Label IdPrflMrgn;
    Label labelAbendDose;
    private User user;
    //TODO SET  for INT
/*    public void OnClikProfil(){
        labelName.setText(user.getName());
        labelPersonFaktor.setText(user.getPersonFaktor());
        labelmorgenDose.setText(user.getMorgendose());
        labelAbendDose.setText(user.getAbendDose());
    }*/

    public void initialize(URL location, ResourceBundle resources) {
        user = new User("NAME", 0,0,0);
        test3btn.setText("Here is name");
    }
}
