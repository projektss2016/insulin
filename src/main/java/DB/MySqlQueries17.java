package DB;

/**
 * Created by nata on 14.09.2016.
 */

        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;
import data.User;


public class MySqlQueries17 {
    public static java.sql.Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    public static Statement statmt1;
    public static ResultSet resSet1;

    private static String passwort = "2309";

    public MySqlQueries17(){
        conn = MyConnection17.getInstance();
    }

    // --------DB connecton--------
    public static void Conn() throws ClassNotFoundException, SQLException {}

    //
//    // --------DB create--------
    public void CreateDB_Product() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists InsulinProduktTab ('ProduktName' VARCHAR  PRIMARY KEY, " +
                "'ProduktFaktor' REAL );");

    }
    public void CreateDB_Profil() throws ClassNotFoundException, SQLException {
        statmt1 = conn.createStatement();
//        statmt1.execute("CREATE TABLE if not exists 'User_ProfilTab' ('Passwort' VARCHAR  PRIMARY KEY, "+
//                "'PersonFaktor' REAL,"+"'MorgenDose' REAL, " +"'AbendDose' REAL, " +"'Gewicht' REAL );");

        statmt1.execute("CREATE TABLE if not exists 'User_ProfilTab' ('Passwort' VARCHAR, "+"'PersonFaktor' REAL,"+"'MorgenDose' REAL, " +"'AbendDose' REAL, " +"'Gewicht' REAL );");

    }
    //
//    // --------Insert -------- Andere Werte input man in SQLiteadmin
    public static void WriteDB_Produkt() throws SQLException {
        statmt = conn.createStatement();
        statmt.execute("INSERT INTO InsulinProduktTab ('ProduktName', 'ProduktFaktor') VALUES ('Brot', 1.453); ");
        statmt.execute("INSERT INTO InsulinProduktTab ('ProduktName', 'ProduktFaktor') VALUES ('Butter', 3.789); ");
        statmt.execute("INSERT INTO InsulinProduktTab ('ProduktName', 'ProduktFaktor') VALUES ('Apfel', 0.6123); ");
    }

    //    // --------Insert --------
    public static void WriteDB_Profil() throws SQLException {
        statmt1 = conn.createStatement();
        statmt1.execute("INSERT INTO User_ProfilTab ('Passwort', 'PersonFaktor','MorgenDose','AbendDose','Gewicht' )" +
                " VALUES ('"+passwort+"', 1.0,0,0,0); ");
    }
    // -------- output--------
    public void ReadDB_Produkt() throws ClassNotFoundException, SQLException {
        try {
            statmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resSet = statmt.executeQuery("SELECT * FROM InsulinProduktTab;");
        System.out.println( " TEST TABELE InsulinProduktTab " );
        while (resSet.next()) {
            String ProduktName = resSet.getString("ProduktName");
            double ProduktFaktor = resSet.getDouble("ProduktFaktor");

            System.out.println(ProduktName +" ======== "+ ProduktFaktor);

        }


    }

    public void ReadDB_Profil() throws ClassNotFoundException, SQLException {
        try {
            statmt1 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resSet1 = statmt1.executeQuery("SELECT * FROM User_ProfilTab;");
        System.out.println( " TEST TABELE User_ProfilTab " );
        while (resSet1.next()) {
            String Passw = resSet1.getString("Passwort");
            double PersF = resSet1.getDouble("PersonFaktor");

            System.out.println(Passw + " ======== " + PersF);

        }

    }

    public static User getUser_ProfilTab() throws ClassNotFoundException, SQLException {
        double PersF=0.;
        double AbenD=0.;
        double MorgD=0.;
        double Gewicht=0.;


        try {
            statmt1 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        resSet1 = statmt1.executeQuery("SELECT * FROM User_ProfilTab;");
        System.out.println( " TEST TABELE User_ProfilTab " );
        while (resSet1.next()) {
            //String Passw = resSet1.getString("Passwort");
            PersF = resSet1.getDouble("PersonFaktor");
            AbenD = resSet1.getDouble("MorgenDose");
            MorgD = resSet1.getDouble("AbendDose");
            Gewicht = resSet1.getDouble("Gewicht");


            //System.out.println(Passw + " ======== " + PersF);
            break;

        }
        //(String name, double personFaktor,double morgenDose,double abendDose,double gewicht)
        return new User("",PersF,MorgD,AbenD,Gewicht);

    }

    public static void setUser_ProfilTab(User u) throws ClassNotFoundException, SQLException {
        double PersF=0.;
        double AbenD=0.;
        double MorgD=0.;
        double Gewicht=0.;


        try {
            statmt1 = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        statmt1.execute("DELETE FROM User_ProfilTab;");
        statmt1.execute("INSERT INTO User_ProfilTab ('Passwort', 'PersonFaktor','MorgenDose','AbendDose','Gewicht' )" +
                " VALUES ('"+passwort+"', "+u.getPersonFaktor()+ "," +
                u.getMorgendose()+ "," + u.getAbendDose()+ ","+ u.getGewicht()+"); ");

    }
//    }






    // --------Close--------
    public void CloseDB() throws ClassNotFoundException, SQLException {
        conn.close();
        statmt.close();
        resSet.close();
        statmt1.close();
        resSet1.close();

    }

}
