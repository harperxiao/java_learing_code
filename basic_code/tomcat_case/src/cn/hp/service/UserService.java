package cn.hp.service;

import cn.hp.domain.PageBean;
import cn.hp.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> findall();

    void addUser(User user);

    void deleteUser(String id);

    void delSelectedUser(String[] ids);

    User findUserById(String id);

    void updateUser(User user);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);

    User login(User user);
}
