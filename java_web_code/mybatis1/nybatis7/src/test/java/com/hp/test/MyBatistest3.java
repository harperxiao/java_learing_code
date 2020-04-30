package com.hp.test;


import com.hp.dao.IUserDao;
import com.hp.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatistest3 {

    private InputStream in;
    private SqlSession sqlSession;
    private IUserDao userDao;


    @Before
    public void init() throws IOException {
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);

        sqlSession = factory.openSession();
        userDao = sqlSession.getMapper(IUserDao.class);

    }

    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public void testFindAll(){
        User user1 = userDao.findById(41);
        System.out.println(user1);

        User user2 = userDao.findById(41);
        System.out.println(user1==user2);
    }

    @Test
    public void testClearlCache(){
        User user1 = userDao.findById(41);
        System.out.println(user1);
        user1.setUsername("update user cache");
        user1.setAddress("北京市海淀区");
        userDao.updateUser(user1);


        User user2 = userDao.findById(41);
        System.out.println(user2);
        System.out.println(user1==user2);
    }


}
