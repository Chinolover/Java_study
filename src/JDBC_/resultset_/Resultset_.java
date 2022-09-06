package JDBC_.resultset_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
//因为Select并非DML语句,所以处理方式不同

//演示Select语句
public class Resultset_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/JDBC_/connect.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url,user,password);

        Statement statement = connection.createStatement();

        String sql = "Select * from actor";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            int id = resultSet.getInt(1);   //获取该行的第一列
            String name = resultSet.getString(2);   //获取该行的第二列
            String sex = resultSet.getString(3);
            Date date = resultSet.getDate(4);
            String phone = resultSet.getString(5);
            System.out.println(id + " " + name + " " + sex+ " "+date+ " " +phone);

        }

        statement.close();
        connection.close();
        resultSet.close();
    }
}
