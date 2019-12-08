package Service;

import DAO.UserDao;
import com.mysql.jdbc.Driver;
import model.User;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
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

    private static Connection getMysqlConnection() {
        try {

//            InitialContext initContext= new InitialContext();
//            DataSource ds = (DataSource) initContext.lookup("java:comp/env/jdbc/test");
//            Connection conn = ds.getConnection();
//            return conn;
            DriverManager.registerDriver(new Driver());
            StringBuilder url = new StringBuilder();
            url.append("jdbc:mysql://")
                .append("localhost:")
                .append("3307/")
                .append("test?")
                .append("user=root&")
                .append("password=root");
            return DriverManager.getConnection(url.toString());
//        } catch (SQLException | NamingException e) {
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException();
        }
    }

    private static UserDao getUserDao() {
        return new UserDao(getMysqlConnection());
    }
}
