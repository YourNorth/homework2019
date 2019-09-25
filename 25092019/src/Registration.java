import Entries.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/reg")
public class Registration extends HttpServlet {

    static String name;
    static String password;
    static String checkbox;
    static User firstUser;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        firstUser = new User("admin","pass");
        HttpSession httpSession = req.getSession();
        String name = (String) httpSession.getAttribute("name");
        String password = (String) httpSession.getAttribute("password");
        if (name == null){
            req.getRequestDispatcher("Registration.jsp").forward(req,resp);
        }
        else{
            req.setAttribute("name",name);
            req.setAttribute("password", "pass");
            resp.sendRedirect("/logout");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
