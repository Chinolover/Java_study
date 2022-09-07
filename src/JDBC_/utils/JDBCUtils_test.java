package JDBC_.utils;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils_test {
    public static void main(String[] args) {
        Connection connection = null;

        String sql = "Insert into peopleuser values (?,?)";
        PreparedStatement preparedStatement = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1,"lcl");
            preparedStatement.setString(2,"lcl1219**..");

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null,preparedStatement,connection);
        }
    }
    @Test
    public void test(){
        Connection connection = null;

        String sql = "Select * from peopleuser";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = JDBCUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String username = resultSet.getString(1);
                String psw = resultSet.getString(2);
                System.out.println(username + psw);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(resultSet,preparedStatement,connection);
        }
    }
}
