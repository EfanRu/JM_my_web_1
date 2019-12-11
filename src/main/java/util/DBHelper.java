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
    private static PropertyReader propertyReader = new PropertyReader();

    public static Connection getMysqlConnection() {
        String host = propertyReader.getProperty("db.host");
        String port = propertyReader.getProperty("db.port");
        String name = propertyReader.getProperty("db.name");
        String login = propertyReader.getProperty("db.login");
        String password = propertyReader.getProperty("db.password");

        try {
            DriverManager.registerDriver(new Driver());
            StringBuilder url = new StringBuilder();
           /* url.append("jdbc:mysql://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(name)
                    .append("?user=")
                    .append(login)
                    .append("&password=")
                    .append(password)
                    .append("&serverTimezone=UTC");*/

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
