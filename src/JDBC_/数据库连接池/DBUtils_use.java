package JDBC_.数据库连接池;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

public class DBUtils_use {
    @Test
    public void test() throws SQLException {
        //演示apache-DBUtils进行单行查询
        Connection connection = JDBCUtilsByDruid.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "Select * from actor where id = ?";

        Actor query = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 4);
        //如果没有查询到，则返回null
        System.out.println(query);

        JDBCUtilsByDruid.close(null,null,connection);
    }

    @Test
    public void test02() throws SQLException {
        //查询单行单列
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();

        String sql = "Select `name` from actor where id = ?";

        Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 4);
        System.out.println(obj);

        JDBCUtilsByDruid.close(null,null,connection);
    }

    @Test
    public void test03() throws SQLException {
        //演示DML操作
        Connection connection = JDBCUtilsByDruid.getConnection();
        QueryRunner queryRunner = new QueryRunner();

        String sql = "update actor set `name` = ? where id = ?";
        int line = queryRunner.update(connection, sql, "李白", 4 );
        //注意：这个update也可以执行insert和delete
        //返回值会受影响的行数
        System.out.println(line>0?"成功":"执行没有影响到表");

        JDBCUtilsByDruid.close(null,null,connection);
    }

    public static void main(String[] args) throws SQLException {
        //使用apache-DBUtils 工具类+druid完成对表的增删改查
        Connection connection = JDBCUtilsByDruid.getConnection();

        //使用DBUtils类和接口，先引入DBUtils相关的jar包，加入到项目
        //创建QueryRunner
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from actor where id >= ?";
        //(1) query 方法就是执行sqL 语句，得到resultset ---封装到--> ArrayList 集合中
        //(2) 返回集合
        //(3) connection: 连接
        //(4) sqL :执行的sqL语句
        //(5) new BeanListHandLer<> (Actor. cLass): 在将resultset -> Actor 对象->封装到ArrayList
        //底层使用反射机制去获取Actor类的属性，然后进行封装
        //(6) 1就是给sqL语句中的?赋值，可以有多个值，因为是可变参数0bject... params
        //(7)底层得到的resultset会在query关闭，关闭PreparedStatement
        List<Actor> list = queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);

        System.out.println("输出集合的信息");
        for (Actor actor :
                list) {
            System.out.println(actor);
        }

        //释放资源
        JDBCUtilsByDruid.close(null,null,connection);
    }
}
