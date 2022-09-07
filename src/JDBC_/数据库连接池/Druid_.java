package JDBC_.数据库连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class Druid_ {
    //阿里提供的接口，性能极佳
    public static void main(String[] args) throws Exception {
        //加入jar包，并引入配置文件到src目录下
        //max wait time为最大连接时间，如果数据库连接时间超过这个就会跳过此次连接
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druid.properties"));

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        String sql = "Select * from peopleuser";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String username = resultSet.getString("username");
            String pwd = resultSet.getString("psw");
            System.out.println(username + pwd);
        }
        resultSet.close();
        connection.close();
        preparedStatement.close();
    }
}
