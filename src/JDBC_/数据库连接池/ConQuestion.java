package JDBC_.数据库连接池;

import JDBC_.utils.JDBCUtils;

import java.sql.Connection;

public class ConQuestion {
    public static void main(String[] args) {
        //我们模拟多用户同时连接数据库
        for (int i = 0; i < 5000; i++) {
            Connection connection = JDBCUtils.getConnection();
        }
    }
}
