package controller;
/**
 * Created by nata on 13.09.2016.
 */
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

                import static controller.MainController.rbSprache;

/**
 * Created by nata on 09.09.2016.
 */
public class berechnungController {

    @FXML
    Button btnZuruckAdminAktion;

    ////TODO

    public void   onClickZuruckAdminAktion(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;
        stage = (Stage) btnZuruckAdminAktion.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getClassLoader().getResource("w_Adminaktion.fxml"));
        //((Label) root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
        //create a new scene with root and set the stage
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Insulin APP");
        stage.show();


    }
}