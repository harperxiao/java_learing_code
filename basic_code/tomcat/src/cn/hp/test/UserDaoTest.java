package cn.hp.test;

import cn.hp.dao.UserDao;
import cn.hp.domain.User;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testLogin(){
        User user = new User();
        user.setUsername("superbaby");
        user.setPassword("123456");

        UserDao userDao = new UserDao();
        User login = userDao.login(user);
        System.out.println(login);
    }
}
