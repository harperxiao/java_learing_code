package com.hp.demo5.jdbc;

import com.hp.demo5.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDemo3 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;
        try{
            conn = JDBCUtils.getConnection();

            conn.setAutoCommit(false);

            String sql1 = "update account set balance = balance - ? where id = ?";

            String sql2 = "update account set balance = balance + ? where id = ?";

            pstmt1 = conn.prepareStatement(sql1);
            pstmt2 = conn.prepareStatement(sql2);


            pstmt1.setInt(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setInt(1,500);
            pstmt2.setInt(2,3);

            pstmt1.executeUpdate();
//            int i = 3/0;

            pstmt2.executeUpdate();

            conn.commit();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt1,conn);
            JDBCUtils.close(pstmt2,null);
        }
    }
}
