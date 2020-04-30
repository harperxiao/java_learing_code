package cn.hp.dao;

import cn.hp.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    public List<User> findall();

    void add(User user);

    void delete(int i);

    User findById(int i);

    void update(User user);

    int findTotalCount(Map<String, String[]> condition);

    List<User> findByPage(int start, int rows, Map<String, String[]> condition);

    User findUserByUsernameAndPassword(String name, String qq);
}
