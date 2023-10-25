package LoginUsingCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class Logout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies =req.getCookies();

        cookies[0].setMaxAge(0);
        cookies[1].setMaxAge(0);

        resp.addCookie(cookies[0]);
        resp.addCookie(cookies[1]);

        resp.sendRedirect("LoginCookies.html");
    }
}
