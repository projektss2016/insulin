package data;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;

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

            //Tab umbenennen
            if (root.lookup("#IdNeuProduktTbPn")!=null) {
                for (Tab aTab : ((TabPane) root.lookup("#IdNeuProduktTbPn")).getTabs()) {
                    if (aTab.getId().equals("IdNeuProduktTab")) {
                        aTab.setText(rbSprache.getString("IdNeuProduktTab"));

                    } else if (aTab.getId().equals("IdProfilTab")) {
                        aTab.setText(rbSprache.getString("IdProfilTab"));
                    }
                }
                ;
            }


            //Spalten in der Tabelle umbenennen
            if (root.lookup("#IdNeuProduktTbl")!=null) {
                /* - geht auch
                ObservableList<TableColumn> columns = ((TableView) root.lookup("#IdNeuProduktTbl")).getColumns();
                for (TableColumn column : columns) {
                    if (column.getId().equals("IdNeuProduktProduktTblCl")) {
                        column.setText(rbSprache.getString("IdNeuProduktProduktTblCl"));
                    } else if (column.getId().equals("IdNeuProduktKhlnHydrTblCl")) {
                        column.setText(rbSprache.getString("IdNeuProduktKhlnHydrTblCl"));
                }
                */
                for (Object aCol : ((TableView) root.lookup("#IdNeuProduktTbl")).getColumns()) {
                    if (((TableColumn) aCol).getId().equals("IdNeuProduktProduktTblCl")) {
                        ((TableColumn) aCol).setText(rbSprache.getString("IdNeuProduktProduktTblCl"));
                    } else if (((TableColumn) aCol).getId().equals("IdNeuProduktKhlnHydrTblCl")) {
                        ((TableColumn) aCol).setText(rbSprache.getString("IdNeuProduktKhlnHydrTblCl"));
                    }

                }
            }

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

            ((TextField)root.lookup("#IdBerMngTfld")).setText(rbSprache.getString("IdBerMngTfld"));

            //Tab umbenennen
            if (root.lookup("#IdBerTbPn")!=null) {
                for (Tab aTab : ((TabPane) root.lookup("#IdBerTbPn")).getTabs()) {
                    if (aTab.getId().equals("IdBerBrngTb")) {
                        aTab.setText(rbSprache.getString("IdBerBrngTb"));

                    }
                }
                ;
            }


            //Spalten in der Tabelle umbenennen
            if (root.lookup("#IdBerTbl")!=null) {

                for (Object aCol : ((TableView) root.lookup("#IdBerTbl")).getColumns()) {
                    if (((TableColumn) aCol).getId().equals("IdBerMngTblCl")) {
                        ((TableColumn) aCol).setText(rbSprache.getString("IdBerMngTblCl"));
                    } else if (((TableColumn) aCol).getId().equals("IdBerProduktTblCl")) {
                        ((TableColumn) aCol).setText(rbSprache.getString("IdBerProduktTblCl"));
                    }

                }
            }
        }

    }
}
