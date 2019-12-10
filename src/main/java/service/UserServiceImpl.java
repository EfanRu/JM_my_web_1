package service;

import dao.UserDaoImpl;
import model.User;
import java.util.List;

import static util.DBHelper.getMysqlConnection;

public class UserServiceImpl implements UserService {
    public UserServiceImpl() {}

    public List<User> getAllUsers() {
        return UserService.getUserDao().getAllUsers();
    }

    public boolean addUser(User u) {
        return UserService.getUserDao().addUser(u);
    }

    public boolean delUser(String id) {
        return UserService.getUserDao().delUser(id);
    }

    public boolean updateUser(String id, String firstName, String lastName, String phoneNumber) {
        return UserService.getUserDao().updateUser(id, firstName, lastName, phoneNumber);
    }

//    private static UserDaoImpl getUserDao() {
//        return new UserDaoImpl(getMysqlConnection());
//    }
}
