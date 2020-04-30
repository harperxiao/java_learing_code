package com.hp.service.impl;

import com.hp.dao.IAccountDao;
import com.hp.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements IAccountService{

    @Resource(name="accountDao2")
    private IAccountDao accountDao = null;


    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }

    public void saveAccount() {
        accountDao.saveAccount();
    }
}
