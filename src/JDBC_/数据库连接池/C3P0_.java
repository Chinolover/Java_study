package JDBC_.数据库连接池;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class C3P0_ {
    //方式1: 相关参数，在程序中指定user, urL , password等

    @Test
    public void test01() throws Exception{
        //1.创建数据源对象
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();

        Properties properties = new Properties();
        properties.load(new FileInputStream("src/JDBC_/connect.properties"));

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //给数据源comboPooledDataSource 设置相关参数
        //因为数据库连接池帮助连接等一系列工作,连接的管理都交由它处理
        comboPooledDataSource.setDriverClass(driver);
        comboPooledDataSource.setUser(user);
        comboPooledDataSource.setPassword(password);
        comboPooledDataSource.setJdbcUrl(url);

        //设置初始化连接数
        comboPooledDataSource.setInitialPoolSize(10);
        //最大连接数
        comboPooledDataSource.setMaxPoolSize(50);
        //这里理解为麦当劳平时十个窗口售餐，过年期间最多也就涨到五十个窗口，如果同时购买超过50人就要进入等待队列

//        Connection connection = comboPooledDataSource.getConnection();//这个方法就是从DateSource实现的
        //所有数据库连接池都要事先DateSource接口

        long start =System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            Connection connection = comboPooledDataSource.getConnection();
            connection.close();
        }
        System.out.println("连接池技术运行时间" + (System.currentTimeMillis()-start));
        //我们可以发现比传统连接快非常多
        //传统耗时7099ms 现在391ms
    }

    //使用配置文件模板来完成 c3p0-config一定要放到src目录下
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource wxh = new ComboPooledDataSource("wxh");

        Connection connection = wxh.getConnection();

        String sql = "Select * from peopleuser";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String username = resultSet.getString(1);
            String psw = resultSet.getString(2);
            System.out.println(username + psw);
        }
        preparedStatement.close();
        wxh.close();
        //关闭ComboPooledDataSource即代表关闭了Connection

    }
}
