package Service;

import DAO.UserDao;
import com.mysql.cj.jdbc.Driver;
import model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class UserService {
    public UserService() {}

    public List<User> getAllUsers() {
        return getUserDao().getAllUsers();
    }

    public boolean addUser(User u) {
        return getUserDao().addUser(u);
    }

    public boolean delUser(String id) {
        return getUserDao().delUser(id);
    }

    public boolean updateUser(String id, String firstName, String lastName, String phoneNumber) {
        return getUserDao().updateUser(id, firstName, lastName, phoneNumber);
    }

    private static Connection getMysqlConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            StringBuilder url = new StringBuilder();
            url.append("jdbc:mysql://")
                .append("localhost:")
                .append("3306/")
                .append("test?")
                .append("user=root&")
                .append("password=root&")
                .append("serverTimezone=UTC");
            return DriverManager.getConnection(url.toString());
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

    private static UserDao getUserDao() {
        return new UserDao(getMysqlConnection());
    }
}
