package com.hp.dao.impl;

import com.hp.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository("accountDao2")
public class AccountDaoImpl2 implements IAccountDao{
    public void saveAccount() {
        System.out.println("保存账户2");
    }
}
