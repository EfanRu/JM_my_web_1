package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/all")
public class AllUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<User> list = new UserService().getAllUsers();
//        if (list == null) {
//            resp.setStatus(403);
//        } else {
//            resp.getWriter().println(list);
            resp.setStatus(200);
//        }
        resp.getWriter().println("It's all OK and working AllUsersServlet!");
//        req.getRequestDispatcher("/AllUsers.jsp").forward(req, resp);
    }
}
