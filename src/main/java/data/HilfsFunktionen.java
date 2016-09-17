package data;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

/**
 * Created by julian on 17.09.2016.
 */
public class HilfsFunktionen {
    static ResourceBundle rbSprache;
    public static void setRbSprache(ResourceBundle rb) {
        rbSprache = rb;
    }
    public static ResourceBundle getRbSprache(ResourceBundle rb) {
        return rbSprache;
    }

    public static void setzeSprache(String meineFxml, Parent root) {
        if ( meineFxml.equals("Start")) {

        } else if ( meineFxml.equals("Admin")) {
            ((Label)root.lookup("#IdRoleWahlen")).setText(rbSprache.getString("IdRoleWahlen"));
            ((Button)root.lookup("#IdAdminBtn")).setText(rbSprache.getString("IdAdminBtn"));
            ((Button)root.lookup("#IdUserBtn")).setText(rbSprache.getString("IdUserBtn"));
            ((Button)root.lookup("#IdRolleZuruckBtn")).setText(rbSprache.getString("IdRolleZuruckBtn"));
        } else if (meineFxml.equals("Passwort")) {
            ((Label)root.lookup("#IdGebenSieBittePwdLbl")).setText(rbSprache.getString("IdGebenSieBittePwdLbl"));
            ((Label)root.lookup("#IdPasswortPwdLbl")).setText(rbSprache.getString("IdPasswortPwdLbl"));
            ((Button)root.lookup("#IdPsswZrckBtn")).setText(rbSprache.getString("IdPsswZrckBtn"));
            ((Button)root.lookup("#IdPsswdBtn")).setText(rbSprache.getString("IdPsswdBtn"));

        } else if ( meineFxml.equals("NeuesProdukt")) {

        } else if ( meineFxml.equals("Berechnung")) {

        }

    }
}
