package com.hp.demo5.jdbc;

import java.sql.*;

public class JdbcDemo1 {
    public static void main(String[] args){
//        Class.forName("com.mysql.jdbc.Driver");
        Statement stmt = null;
        Connection con = null;
        ResultSet rs = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql:///db1", "root", "root");
//            String sql = "update account set balance=2000 where id = 1";
//            String sql = "insert into account values(null ,3000)";
//            String sql  = "delete from account where id = 2";
//            String sql  = "create table student (id int , name varchar(20))";
            String sql  = "select * from account";


            stmt = con.createStatement();
//            int count = stmt.executeUpdate(sql);
//            System.out.println(count);
            rs = stmt.executeQuery(sql);

            while (rs.next()){
                int id = rs.getInt(1);
                int balance = rs.getInt(2);
                System.out.println(id+"----"+balance);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (stmt!=null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (con!=null){
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
