import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setAttribute(Registration.name, "name");
        req.setAttribute(Registration.password, "password");
        System.out.println("rrr" + Registration.name + " " + Registration.password);
        req.getRequestDispatcher("Logout.jsp").forward(req, resp);*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*Registration.checkbox = req.getParameter("checkbox");
        System.out.println(Registration.checkbox);
        Registration.name = req.getParameter("name");
        Registration.password = req.getParameter("password");
        if(!(Registration.name.equals(Registration.firstUser.getName())&Registration.password.equals(Registration.firstUser.getPassword()))){
            resp.sendRedirect("/reg");
        }
        req.setAttribute("name", Registration.name);
        req.setAttribute("password", Registration.password);
        System.out.println(Registration.name + " " + Registration.password);
        req.getRequestDispatcher("Logout.jsp").forward(req, resp);*/
        HttpSession session = req.getSession(false);
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if("admin".equals(name)&&"pass".equals(password)){
            session.setAttribute("name", name);
        }
    }
}
