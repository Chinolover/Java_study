package JDBC_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class Homework02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();

        properties.load(new FileInputStream("src/JDBC_/connect.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,password);

        String sql = "Insert into Peopleuser Values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,"wxh");
        preparedStatement.setString(2,"wxh0317**..");

        int i = preparedStatement.executeUpdate();
        System.out.println(i>0 ? "成功":"失败" );

        preparedStatement.close();
        connection.close();
    }
}
