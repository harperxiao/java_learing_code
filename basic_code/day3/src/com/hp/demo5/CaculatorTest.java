package com.hp.demo5;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CaculatorTest {

    @Before
    public void init(){
        System.out.println("init...");
    }

    @After
    public void close(){
        System.out.println("close...");
    }

    @Test
    public void testAdd(){
        System.out.println("tesetadd...");
        int result =3;
        System.out.println(result);
        Assert.assertEquals(3,result);
    }
}

