package LoginUsingCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/loginCookies")
public class LoginPage extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        Cookie cookie = new Cookie("na", name);
        Cookie cookie1 = new Cookie("pass", password);

        resp.addCookie(cookie);
        resp.addCookie(cookie1);

        resp.sendRedirect("profile");

    }
}
