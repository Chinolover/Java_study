package JDBC_.批处理;

import JDBC_.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch_ {
    public static void main(String[] args) throws SQLException {
        //传统方法测试批处理时间
        Connection connection = JDBCUtils.getConnection();

        String sql = "Insert into admin2 Values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统时间耗时 =" + (end - start)); //2807

        JDBCUtils.close(null,preparedStatement,connection);
    }

    @Test
    public void Batch() throws SQLException {
        //批处理执行
        Connection connection = JDBCUtils.getConnection();

        String sql = "Insert into admin2 Values (null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //批处理一定要添加配置信息
//        url后加?rewriteBatchedStatements=true
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1,"jack" + i);
            preparedStatement.setString(2,"666");
            preparedStatement.addBatch();
            //当有1000条数据提交一次
            if ((i + 1) % 1000 == 0){
                preparedStatement.executeBatch();
                //清空
                preparedStatement.clearBatch();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批处理时间耗时 =" + (end - start));

        JDBCUtils.close(null,preparedStatement,connection);
    }
}
