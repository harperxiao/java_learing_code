package com.hp.dao.impl;

import com.hp.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao1")
public class AccountDaoImpl implements IAccountDao{
    public void saveAccount() {
        System.out.println("保存账户1");
    }
}
