package com.hp.demo5.jdbc;

import com.hp.demo5.Domain.Account;
import com.hp.demo5.util.JDBCUtil1;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class JdbcDemo4 {
    public static void main(String[] args) {
        JdbcTemplate template = new JdbcTemplate(JDBCUtil1.getDataSource());
//        String sql = "update account set balance=5000 where id = ?";
//        int count = template.update(sql, 4);
//        System.out.println(count);

//        String sql = "delete from account where id = ?";
//        template.update(sql,4);

//        String sql = "select * from account where id = ?";
//        Map<String, Object> map = template.queryForMap(sql, 1);
//        System.out.println(map);


        String sql = "select * from account";
//        List<Account> query = template.query(sql, new RowMapper<Account>() {
//            @Override
//            public Account mapRow(ResultSet rs, int i) throws SQLException {
//                Account account = new Account();
//                int id = rs.getInt("id");
//                int balance = rs.getInt("balance");
//
//                account.setBalance(balance);
//                account.setBalance(id);
//
//                return account;
//            }
//        });

        List<Account> query = template.query(sql, new BeanPropertyRowMapper<Account>(Account.class));

        for (Account account : query) {
            System.out.println(account);

        }

    }
}
