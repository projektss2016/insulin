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
public class profilController {

    @FXML
    Button fxPrflZrckBtn;

    ////TODO

    public void onClickZurueck(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) fxPrflZrckBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Admin0909.fxml"));
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        HilfsFunktionen.setzeSprache("Admin",root);
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();


    }
}