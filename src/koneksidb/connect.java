package koneksidb;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class connect {
    public static Connection con;
    public static Statement stm;
    public static void config(){
        try{
            String url ="jdbc:mysql://localhost:3306/uas pbo";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.err.println("Koneksi Gagal" +e.getMessage());
        }
    }
    
}