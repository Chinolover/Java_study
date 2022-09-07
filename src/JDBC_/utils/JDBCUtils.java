package JDBC_.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//JDBC工具类，完成mysql的连接和关闭资源
public class JDBCUtils {
    //定义相关属性
    private static String user;
    private static String password;
    private static String url;
    private static String driver;

    //static代码块初始化
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/JDBC_/connect.properties"));

            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");

            Class.forName(driver);
        } catch (Exception e) {
//            e.printStackTrace();
            //实际开发中这么处理
            //1. 将编译异常转成运行异常
            //2.这是调用者，可以选择捕获该异常，也可以选择默认处理该异常，比较方便.
            throw  new RuntimeException(e);
        }
    }

    //连接数据库,返回Connection
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(url,user,password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    //关闭相应资源
    public static void close(ResultSet set, Statement statement,Connection connection){
        try {
            if(set!=null)
                set.close();
            if(statement!=null)
                statement.close();
            if(connection!=null)
                connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
