package util;

import com.mysql.cj.jdbc.Driver;
import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHelper {
    public static Connection getMysqlConnection() {
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
}
