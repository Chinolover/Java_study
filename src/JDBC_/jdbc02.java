package JDBC_;

import com.mysql.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class jdbc02 {
    public static void main(String[] args){
        //数据库连接的5种方式

    }

    @Test
    public void test01() throws SQLException {
        //First 普通Statement连接
        Driver driver = new Driver();   //静态连接不灵活

        String url = "jdbc:mysql://localhost:3306/jdbc_study";

        Properties properties = new Properties();
        properties.setProperty("user","root"); // 用户
        properties.setProperty("password","wxh0317**..");   //密码

        Connection connect = driver.connect(url,properties);
        //3.执行mysql
        String sql = "insert into actor values(2,'王兴华','男','1970-11-11','110')";
        //statement 用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);    //执行SQL语句，如果是dml语句，返回的就是影响行数
        //大于0成功，小于0即为失败
        System.out.println(rows > 0 ? "成功" : "失败");
        //4.关闭连接资源
        statement.close();
        connect.close();
    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        //Second 反射连接
        Class<?> clazz = Class.forName("com.mysql.jdbc.Driver");    //反射动态连接比较灵活
        Driver driver1 = (Driver) clazz.getConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/jdbc_study";

        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","wxh0317**..");

        Connection connect = driver1.connect(url,properties);

        String sql = "insert into actor values (3,'lcl','女','2000-12-19','120')";

        Statement statement = connect.createStatement();
        int row = statement.executeUpdate(sql);
    }

    @Test
    public void test03() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        //Third DriverManger 代替 Driver进行统一管理,具有更好扩展性
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.getConstructor().newInstance();

        String url = "jdbc:mysql://localhost:3306/jdbc_study";
        String user = "root";
        String password = "wxh0317**..";

        DriverManager.registerDriver(driver);//注册Driver驱动

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
    }

    @Test
    public void test04() throws ClassNotFoundException, SQLException {
        //推荐使用
        //Fourth 使用Class.forName 自动完成注册驱动，简化代码，用的最多
        //在加载Driver类时，完成注册
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jdbc_study";
        String user = "root";
        String password = "wxh0317**..";

        Connection connection = DriverManager.getConnection(url,user,password);
    }

    @Test
    public void test05() throws IOException, ClassNotFoundException, SQLException {
        //开发强烈推荐第五种
        //方式四基础上改进，增加配置文件，让连接mysql更灵活
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/JDBC_/connect.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

//        1. mysqL驱动5.1.6可以无需CLass.forName("com.mysql.jdbc.Driver");
//        2.从jdk1.5以后使用了jdbc4,不再需要显示调用class.forName()注册驱动而是自动调用驱动
//        jar包下META-INF\services\java.sql.Driver文本中的类名称去注册
//        3. 建议还是写上CLass.forName
    }
}
