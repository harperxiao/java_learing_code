package com.hp.dao;

import com.hp.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account (id,name,money) values (3,#{name},#{money})")
    public void saveAccount(Account account);

}
