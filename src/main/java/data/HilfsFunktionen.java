package data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.*;

import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import DB.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * Created by flora on 17.09.2016.
 */
public class HilfsFunktionen {
    static ResourceBundle rbSprache;
    static String mlang;
    public static void setRbSprache(ResourceBundle rb, String spr) {
        rbSprache = rb;
        mlang = spr;
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
            ((Label)root.lookup("#IdBerErgbnsLbl")).setText(rbSprache.getString("IdBerErgbnsLbl"));
            ((Button)root.lookup("#IdBerHnzfgBtn")).setText(rbSprache.getString("IdBerHnzfgBtn"));
            ((Button)root.lookup("#IdBerBrchnBtn")).setText(rbSprache.getString("IdBerBrchnBtn"));
            ((Button)root.lookup("#IdBtnZuruckAdminAktion")).setText(rbSprache.getString("IdBtnZuruckAdminAktion"));

            if (root.lookup("#IdBerProduktCb")!=null){
                ComboBox b =(ComboBox)root.lookup("#IdBerProduktCb");
                b.setPromptText(rbSprache.getString("IdBerProduktCb"));
            }
            ((TextField)root.lookup("#IdBerPersFaktTfld")).setText(rbSprache.getString("IdBerPersFaktTfld"));

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
    public static void speichereProfil(String strMdos, String strAdos,String strGewicht, String strPerFak) {
        double mDos=Double.parseDouble(strMdos);
        double aDos=Double.parseDouble(strAdos);
        double gewicht=Double.parseDouble(strGewicht);
        double perf=Double.parseDouble(strPerFak);
        //(String name, double personFaktor,double morgenDose,double abendDose,double gewicht)

        try {
            MySqlQueries17.setUser_ProfilTab(new User("",perf,mDos,aDos,gewicht));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void ladeProfil(Parent root) {
        User u = null;
        try {
            u = MySqlQueries17.getUser_ProfilTab();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //IdPrflMrgnTfld
        ((TextField)root.lookup("#IdPrflMrgnTfld")).setText(String.valueOf(u.getMorgendose()));
        ((TextField)root.lookup("#IdPrflAbndTfld")).setText(String.valueOf(u.getAbendDose()));
        ((TextField)root.lookup("#IdPrflGwchtTfld")).setText(String.valueOf(u.getGewicht()));
        ((TextField)root.lookup("#IdPrflPersFkTfld")).setText(String.valueOf(u.getPersonFaktor()));

    }
    public static void ladeNeuProdukt(Parent root) {
        ResultSet res = null;
        //ObservableList<ObservableList> data;
        ObservableList<TVneuesProdukt> data;
        String str;
        try {
            res=MySqlQueries17.getProdukt("ALL");
            data = FXCollections.observableArrayList();
            TableView tableview = (TableView) root.lookup("#IdNeuProduktTbl");

            /********************************
             * Data added to ObservableList *
             ********************************/
            while(res.next()){
                //Iterate Row

                /*ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=res.getMetaData().getColumnCount(); i++){
                    //Iterate Column
                    //row.add(res.getString(i));
                    TVneuesProdukt t = new TVneuesProdukt();

                }*/

                TVneuesProdukt t = new TVneuesProdukt();
                if (mlang.toUpperCase().equals("DE")) {
                    str=res.getString("ProduktNameDE");
                } else {
                    str=res.getString("ProduktNameRU");
                }
                if (str == null)
                    continue;
                if (str.equals(""))
                    continue;
                t.setProduktname(str);
                t.setKohlenhydrate(res.getString("ProduktFaktor"));

                //System.out.println("Row [1] added "+row );
                data.add(t);

            }

            tableview.setEditable(true);
            tableview.setItems(data);




        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public static void speichereEinNeuesProdukt(TVneuesProdukt t) {

        try {
            MySqlQueries17.setProdukt(t,mlang);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static double macheBerechnung(ObservableList<TVberechnung> data,double perFak) {
        ResultSet res;
        double erg=0.;
        String str;
        double kohlenHydr,menge;
        try {
           res=MySqlQueries17.getProdukt("ALL");

            while(res.next()){
                if (mlang.toUpperCase().equals("DE")) {
                    str=res.getString("ProduktNameDE");
                } else {
                 str=res.getString("ProduktNameRU");
                }
                if (str == null)
                    continue;
                if (str.equals(""))
                    continue;
                for(TVberechnung a : data){
                    if(a.getBerProduktname().equals(str)) {
                        str=res.getString("ProduktFaktor");
                        kohlenHydr=Double.parseDouble(str);
                        menge=Double.parseDouble(a.getBerMenge());
                        erg += menge/100.*perFak*kohlenHydr;
                        break;
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return erg;

    }
    public static void ladeBerechnung(Parent root) {
        User u = null;
        ResultSet res;
        ComboBox b =(ComboBox)root.lookup("#IdBerProduktCb");
        ObservableList<String> data;
        data = FXCollections.observableArrayList();
        String str;
        try {
            u = MySqlQueries17.getUser_ProfilTab();
            res=MySqlQueries17.getProdukt("ALL");

            while(res.next()){
                if (mlang.toUpperCase().equals("DE")) {
                    str=res.getString("ProduktNameDE");
                } else {
                    str=res.getString("ProduktNameRU");
                }
                if (str == null)
                    continue;
                if (str.equals(""))
                    continue;
                data.add(str);
            }
            b.setItems(data);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ((TextField)root.lookup("#IdBerPersFaktTfld")).setText(String.valueOf(u.getPersonFaktor()));

	}

}
