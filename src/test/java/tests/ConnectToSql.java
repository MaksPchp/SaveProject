package tests;

import org.testng.annotations.Test;
import testNgRunner.TestNgRunner;

import java.sql.*;

public class ConnectToSql extends TestNgRunner{

    @Test
    public void test() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/gs_db";
        String user = "channel_user";
        String password = "6a1LHDGD1VxKcUla";

        Class.forName("com.mysql.jdbc.Driver");
        String query = "SELECT * FROM channel_list.channels_faq";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String author = rs.getString(3);
                System.out.printf("id: %d, name: %s, author: %s %n", id, name, author);
            }
    }

}
