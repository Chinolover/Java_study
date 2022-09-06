package JDBC_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Homework01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/JDBC_/connect.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,password);

        String sql = "Insert into actor Values (1,'wxh','男','2001-3-17','110')," +
                "(2,'lcl','女','2000-12-19','120'),(3,'lph','女','2009-1-1','119')," +
                "(4,'hyn','男','2001-5-8','911'),(5,'hby','女','2001-6-11','12129')";

        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);

        String sql2 = "Update actor SET `name`='hxw' where id=1";
        statement.executeUpdate(sql2);

        String sql3 = "Delete From actor where id=3";
        statement.executeUpdate(sql3);

        statement.close();
        connection.close();
    }
}
