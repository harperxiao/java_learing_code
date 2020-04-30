package com.hp.demo5.jdbc;

import com.hp.demo5.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("请输入用户金额");
        int ba = Integer.parseInt(sc.nextLine());
        boolean b = new JdbcDemo2().login(id,ba);
        if (b){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
    }

    private boolean login(int id, int ba) {
        Connection con = null;
        PreparedStatement pstmt =  null;
        ResultSet rs = null;
        try{
            con = JDBCUtils.getConnection();
            String sql = "select * from account where id = ? and balance = ?";

            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,id);
            pstmt.setInt(2,ba);

            rs = pstmt.executeQuery();

            return rs.next();


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.close(rs,pstmt,con);
        }
        return false;
    }
}
