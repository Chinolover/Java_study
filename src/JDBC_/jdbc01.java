package JDBC_;

import com.mysql.jdbc.Driver;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new Driver();   //注意不要引错包了，血的教训 com.mysql.jdbc.Driver
        //2.得到连接
        //(1) jdbc:mysql:// 规定好表示协议，通过jdbc的方式连接mysql
        //(2) LocaLhost 主机，可以是ip地址
        //(3) 3306 表示mysql监听的接口
        //(4) jdbc_study表示连接的数据库
        String url = "jdbc:mysql://localhost:3306/jdbc_study";

        Properties properties = new Properties();
        properties.setProperty("user","root"); // 用户
        properties.setProperty("password","wxh0317**..");   //密码

        Connection connect = driver.connect(url,properties);
        //3.执行mysql
        String sql = "insert into actor values(1,'刘德华','男','1970-11-11','110')";
        //statement 用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);    //执行SQL语句，如果是dml语句，返回的就是影响行数
        //大于0成功，小于0即为失败
        System.out.println(rows > 0 ? "成功" : "失败");
        //4.关闭连接资源
        statement.close();
        connect.close();
    }
}
