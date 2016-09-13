package controller;

import data.User;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by nata on 06.09.2016.
 */
public class dritteController implements Initializable {
    @FXML
    Button test3btn;

    private User user;



    public void OnClik3(){
       test3btn.setText(user.getName());
    }

    public void initialize(URL location, ResourceBundle resources) {
        user = new User("NAME",0,0,0);
        test3btn.setText("Here is name");
    }
}
