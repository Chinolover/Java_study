package JDBC_.事务;

import JDBC_.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class transaction_ {
    public static void main(String[] args) {
        //模拟转账演示事务的处理，因为转账需要接受和发送同时执行，否则可能会发生吞钱
        Connection connection = null;

        String sql = "update account set balance = balance-100 where id = 1";
        String sql2 = "update account set balance = balance+100 where id =2";
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            //设置事务为不自动提交
            connection.setAutoCommit(false);    //开启事务
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            //比如上面成功下面失败就会出现严重的问题
//            int i = 1/0;

            preparedStatement= connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();

            connection.commit();    //  提交事务
        } catch (SQLException e) {
            try {
                //回滚
                connection.rollback();  //参数为回滚点，默认为开启事务的地方
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
}
