package Service;

import DAO.UserDao;
import com.mysql.jdbc.Driver;
import model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class UserService {

    public UserService() {}

    public List<User> getAllUsers() {
        return new UserDao(getMysqlConnection()).getAllUsers();
    }

    public boolean addUser(User u) {
        return new UserDao(getMysqlConnection()).addUser(u);
    }

    private static Connection getMysqlConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            StringBuilder url = new StringBuilder();
            url.append("jdbc:mysql://")
                .append("localhost:")
                .append("3307/")
                .append("test?")
                .append("user=root&")
                .append("password=root");
            return DriverManager.getConnection(url.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

    private static UserDao getBankClientDAO() {
        return new UserDao(getMysqlConnection());
    }
}
