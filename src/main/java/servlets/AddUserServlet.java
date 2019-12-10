package servlets;

import service.UserServiceImpl;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("first name");
        String lastName = req.getParameter("last name");
        String phoneNum = req.getParameter("phone number");

        if (new UserServiceImpl().addUser(new User(firstName, lastName, Long.parseLong(phoneNum)))) {
            resp.setStatus(200);
        } else {
            resp.setStatus(403);
        }
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
