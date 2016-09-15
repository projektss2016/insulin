package DB;

/**
 * Created by nata on 14.09.2016.
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class MySqlQueries {
    public static java.sql.Connection conn;
    public static Statement statmt;
    public static ResultSet resSet;

    public MySqlQueries(){
        conn = MyConnection.getInstance();
    }

    // --------DB connecton--------
    public static void Conn() throws ClassNotFoundException, SQLException {
//        MySqlQueries = null;
//        Class.forName("org.sqlite.JDBC");
// Class.forName("com.mysql.jdbc.Driver ");
//        MySqlQueries = DriverManager.getConnection("jdbc:mysql:13306");
//        MySqlQueries = DriverManager.getConnection("jdbc:sqlite:ProduktTab.s3db");
//
//        System.out.println("DB connected");
    }

    // --------DB create--------
    public void CreateDB() throws ClassNotFoundException, SQLException {
        statmt = conn.createStatement();
        statmt.execute("CREATE TABLE if not exists 'ProduktTab1' ('ProduktName' VARCHAR  PRIMARY KEY, " +
                "'PrduktFaktor' REAL );");

    }

    // --------Insert --------
    public static void WriteDB() throws SQLException {
        statmt.execute("INSERT INTO 'ProduktTab1' ('ProduktNAme', 'ProduktFaktor') VALUES ('Brot', 125453); ");
        statmt.execute("INSERT INTO 'ProduktTab1' ('ProduktNAme', 'ProduktFaktor') VALUES ('Butter', 321789); ");
        statmt.execute("INSERT INTO 'ProduktTab1' ('ProduktNAme', 'ProduktFaktor') VALUES ('Apfel', 456123); ");
    }

    // -------- output--------
    public void ReadDB() throws ClassNotFoundException, SQLException {
        try {
            statmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resSet = statmt.executeQuery("SELECT * FROM ProduktTab1;");

        while (resSet.next()) {
            String ProduktName = resSet.getString("ProduktName");
            double ProduktFaktor = resSet.getDouble("ProduktFaktor");

            System.out.println(ProduktName +" ======== "+ ProduktFaktor);
        }


    }

    // --------Закрытие--------
    public void CloseDB() throws ClassNotFoundException, SQLException {
        conn.close();
        statmt.close();
        resSet.close();


    }

}
