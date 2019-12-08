package Util;

import model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class DBHelper {
    private static SessionFactory sf;

    public static SessionFactory getSessionFactory() {
        if (sf == null) {
            sf = createSessionFactory();
        }
        return sf;
    }

    private static SessionFactory createSessionFactory() {
        Configuration conf = getMySqlConf();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder.applySettings(conf.getProperties());
        ServiceRegistry serviceRegistry = builder.build();
        return conf.buildSessionFactory(serviceRegistry);
    }

    private static Configuration getMySqlConf() {
        Configuration conf = new Configuration();
        conf.addAnnotatedClass(User.class);

        conf.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        conf.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        conf.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3307/test");
        conf.setProperty("hibernate.connection.username", "root");
        conf.setProperty("hibernate.connection.password", "root");
        conf.setProperty("hibernate.show_sql", "true");
        conf.setProperty("hibernate.hbm2ddl.auto", "create");
        return conf;
    }
}
