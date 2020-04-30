package com.hp.demo5.Datasource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3p0Demo1 {
    public static void main(String[] args) throws SQLException {
//        DataSource ds = new ComboPooledDataSource();
//        Connection conn = ds.getConnection();
//        System.out.println(conn);

        DataSource ds = new ComboPooledDataSource("otherc3p0");
        for (int i = 0; i < 8; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+":"+conn);
        }

    }
}
