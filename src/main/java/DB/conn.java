//package DB;
//
///**
// * Created by nata on 14.09.2016.
// */
//
//import java.sql.Connection;
//        import java.sql.DriverManager;
//        import java.sql.ResultSet;
//        import java.sql.SQLException;
//        import java.sql.Statement;
//
//
//public class conn {
//    public static Connection conn;
//    public static Statement statmt;
//    public static ResultSet resSet;
//
//    // --------DB connecton--------
//    public static void Conn() throws ClassNotFoundException, SQLException
//    {
//        conn = null;
//        Class.forName("org.sqlite.JDBC");
//        conn = DriverManager.getConnection("jdbc:sqlite:ProduktTab.s3db");
//
//        System.out.println("DB connected");
//    }
//
//    // --------DB create--------
//    public static void CreateDB() throws ClassNotFoundException, SQLException
//    {
//        statmt = conn.createStatement();
//        statmt.execute("CREATE TABLE if not exists 'ProduktTab1' ('ProduktName' VARCHAR  PRIMARY KEY AUTOINCREMENT, " +
//                "'PrduktFaktor' REAL );");
//
//            }
//
//    // --------Insert --------
//    public static void WriteDB() throws SQLException
//    {
//        statmt.execute("INSERT INTO 'users' ('ProduktNAme', 'ProduktFaktor') VALUES ('Brot', 125453); ");
//        statmt.execute("INSERT INTO 'users' ('ProduktNAme', 'ProduktFaktor') VALUES ('Butter', 321789); ");
//        statmt.execute("INSERT INTO 'users' ('ProduktNAme', 'ProduktFaktor') VALUES ('Apfel', 456123); ");
//
//
//    }
//
//    // -------- output--------
//    public static void ReadDB() throws ClassNotFoundException, SQLException {
//        resSet = statmt.executeQuery("SELECT * FROM ProduktTab1");
//
//        while (resSet.next()) {
//            String ProduktName = resSet.getProduktName("ProduktName");
//            int ProduktFaktor = resSet.getProduktFaktor("ProduktFaktor");
//        }
//
//    }
//
//    // --------Закрытие--------
//    public static void CloseDB() throws ClassNotFoundException, SQLException
//    {
//        conn.close();
//        statmt.close();
//        resSet.close();
//
//
//    }
//
//}
