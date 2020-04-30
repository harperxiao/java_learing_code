package com.hp.demo5.Datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.hp.demo5.util.JDBCUtil1;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class DruidDemo {
    public static void main(String[] args) {
//        Properties pro = new Properties();
//        InputStream is = DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
//        pro.load(is);
//
//
//        DataSource ds = DruidDataSourceFactory.createDataSource(pro);
//        Connection conn = ds.getConnection();
//        System.out.println(conn);

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = JDBCUtil1.getConnection();

            String sql = "insert into account values (null,?)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1,20000);

            int i = pstmt.executeUpdate();
            System.out.println(i);

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil1.close(pstmt,conn);
        }
    }
}
