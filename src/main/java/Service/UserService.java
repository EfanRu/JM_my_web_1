package Service;

import DAO.UserDao;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UserService {

    public UserService() {}

    private static Connection getMysqlConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            StringBuilder url = new StringBuilder();
            url.append("jdbc:mysql://")
                .append("localhost:")
                .append("3306/")
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
