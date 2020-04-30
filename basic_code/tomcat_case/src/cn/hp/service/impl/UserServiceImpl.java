package cn.hp.service.impl;

import cn.hp.dao.Impl.UserDaoImpl;
import cn.hp.dao.UserDao;
import cn.hp.domain.PageBean;
import cn.hp.domain.User;
import cn.hp.service.UserService;

import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
    private UserDao dao = new UserDaoImpl();

    @Override
    public void delSelectedUser(String[] ids) {
        if (ids!=null&& ids.length>0){
            for (String id : ids) {
                dao.delete(Integer.parseInt(id));
            }
        }
    }

    @Override
    public User login(User user) {
        return dao.findUserByUsernameAndPassword(user.getName(),user.getQq());
    }

    @Override
    public PageBean<User> findUserByPage(String _currentPage, String _rows, Map<String, String[]> condition) {

        int currentPage = Integer.parseInt(_currentPage);
        int rows = Integer.parseInt(_rows);

        if (currentPage<=0){
            currentPage = 1;
        }

        PageBean<User> pb = new PageBean<>();

        pb.setCurrentPage(currentPage);
        pb.setRows(rows);

        int totalcount = dao.findTotalCount(condition);
        pb.setTotalCount(totalcount);

        int start = (currentPage-1)*rows;
        List<User> list = dao.findByPage(start,rows,condition);
        pb.setList(list);


        int totalPage = (totalcount%rows==0)?totalcount/rows:(totalcount/rows)+1;
        pb.setTotalPage(totalPage);
        return pb;
    }

    @Override
    public void updateUser(User user) {
        dao.update(user);
    }

    @Override
    public User findUserById(String id) {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public void addUser(User user) {
        dao.add(user);
    }

    @Override
    public List<User> findall() {
        return dao.findall();
    }

    @Override
    public void deleteUser(String id) {
        dao.delete(Integer.parseInt(id));
    }
}
