package DAO;

import Util.DBHelper;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private Connection connection;

    public UserDao(Connection c) {
        this.connection = c;
    }

    public List<User> getAllUsers() {
        List<User> result = new ArrayList<>();

        try (Statement stmt = connection.createStatement()) {
            stmt.execute("select * from users");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                result.add(new User(rs.getLong(1),
                                    rs.getString(2),
                                    rs.getString(3),
                                    rs.getLong(4)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean addUser(User u) {
        String sql = "insert into users values(?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setLong(1, u.getId());
            pstmt.setString(2, u.getFirstName());
            pstmt.setString(3, u.getLastName());
            pstmt.setLong(4, u.getPhoneNumber());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    /*
    public void createTable() throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.execute("create table if not exists bank_client (id bigint auto_increment, name varchar(256), password varchar(256), money bigint, primary key (id))");
        stmt.close();

        create table if not exists users (id bigint auto_increment, first_name varchar(256), last_name varchar(256), phone_number bigint, primary key (id))
    }

    public void dropTable() throws SQLException {
        Statement stmt = connection.createStatement();
        stmt.executeUpdate("DROP TABLE IF EXISTS bank_client");
        stmt.close();
    }
    */
}
