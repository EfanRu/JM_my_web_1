package Servlets;

import Service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class EditUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setStatus(200);
        req.getRequestDispatcher("/EditUsers.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String firstName = req.getParameter("first name");
        String lastName = req.getParameter("last name");
        String phoneNumber = req.getParameter("phone number");

        if (new UserService().updateUser(id, firstName, lastName, phoneNumber)) {
            resp.setStatus(200);
            resp.getWriter().println("User id = " + id + " has been updated");
        } else {
            resp.setStatus(403);
            resp.getWriter().println("User id = " + id + " didn't updated");
        }
    }
}
