package JDBC_.Preparedstatement_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//演示Preparedstatement使用
public class preparestatement_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
//●预处理好处
//        1.不再使用+拼接sq|语句，减少语法错误
//        2. 有效的解决了sq|注入问题!
//        3.大大减少了编译次数，效率较高

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/JDBC_/connect.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        //SQL的？相当于占位符
        String sql = "Select `name`,sex From actor Where `name`=? and sex=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //preparedStatement.setString参数第一个为第几个问号，第二个代表参数值
        preparedStatement.setString(1,"hxw");
        preparedStatement.setString(2,"男");

        //执行Select使用executeQuery，执行dml则使用executeUpdate,并且不用再在executeQuery里写入sql了
        ResultSet resultSet = preparedStatement.executeQuery();

        if(resultSet.next()){
            System.out.println("查询成功");
            System.out.println(resultSet.getString(1) + resultSet.getString(2));
        }
        else
            System.out.println("查询失败");

        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
}
