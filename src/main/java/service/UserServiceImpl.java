package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;
import util.DBHelper;

import java.util.List;

import static util.DBHelper.getMysqlConnection;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl(DBHelper.getMysqlConnection());

    public UserServiceImpl() {}

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public boolean addUser(User u) {
        return userDao.addUser(u);
    }

    public boolean delUser(String id) {
        return userDao.delUser(id);
    }

    public boolean updateUser(String id, String firstName, String lastName, String phoneNumber) {
        return userDao.updateUser(id, firstName, lastName, phoneNumber);
    }
}
