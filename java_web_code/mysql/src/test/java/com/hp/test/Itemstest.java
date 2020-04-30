package com.hp.test;

import com.hp.dao.ItemsDao;
import com.hp.dao.impl.ItemsDaoImpl;
import com.hp.domain.Items;
import org.junit.Test;

import java.util.List;

public class Itemstest {
    @Test
    public void findAll() throws  Exception{
        ItemsDao itemsDao = new ItemsDaoImpl();
        List<Items> list = itemsDao.findAll();
        for (Items items : list) {
            System.out.println(items.getName());
        }
    }
}
