package data;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ResourceBundle;

/**
 * Created by flora on 17.09.2016.
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
            //da wollen wir jetzt erstmal nicht übersetzen - später
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
            ((Label)root.lookup("#IdNeuProduktLbl")).setText(rbSprache.getString("IdNeuProduktLbl"));
            ((Label)root.lookup("#IdNeuProduktKhlnHydrLbl")).setText(rbSprache.getString("IdNeuProduktKhlnHydrLbl"));
            ((Label)root.lookup("#IdPro100gLbl")).setText(rbSprache.getString("IdPro100gLbl"));
            ((Button)root.lookup("#IdNeuProduktZrckBtn")).setText(rbSprache.getString("IdNeuProduktZrckBtn"));
            ((Button)root.lookup("#IdNeuProduktSpchrnBtn")).setText(rbSprache.getString("IdNeuProduktSpchrnBtn"));
            ((Label)root.lookup("#IdPrflMrgnLbl")).setText(rbSprache.getString("IdPrflMrgnLbl"));
            ((Label)root.lookup("#IdPrflAbndLbl")).setText(rbSprache.getString("IdPrflAbndLbl"));
            ((Label)root.lookup("#IdPrflGwchtLbl")).setText(rbSprache.getString("IdPrflGwchtLbl"));
            ((Label)root.lookup("#IdPrflPersFktLbl")).setText(rbSprache.getString("IdPrflPersFktLbl"));
            ((Button)root.lookup("#IdPrflSpchrnBtn")).setText(rbSprache.getString("IdPrflSpchrnBtn"));
            ((Button)root.lookup("#IdPrflZrckBtn")).setText(rbSprache.getString("IdPrflZrckBtn"));

        } else if ( meineFxml.equals("Berechnung")) {
            ((Label)root.lookup("#IdBerProduktLbl")).setText(rbSprache.getString("IdBerProduktLbl"));
            ((Label)root.lookup("#IdBerMngLbl")).setText(rbSprache.getString("IdBerMngLbl"));
            ((Button)root.lookup("#IdBerHnzfgBtn")).setText(rbSprache.getString("IdBerHnzfgBtn"));
            ((Button)root.lookup("#IdBerBrchnBtn")).setText(rbSprache.getString("IdBerBrchnBtn"));
            ((Button)root.lookup("#IdBtnZuruckAdminAktion")).setText(rbSprache.getString("IdBtnZuruckAdminAktion"));


        }

    }
}
