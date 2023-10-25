package SessionTracking.Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/cookies1")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        Cookie ck = new Cookie("cookieKeyName", name);      // the object of cookie is created and it is stored in key value pair
        resp.addCookie(ck);                                       // in next page we can get using req

        writer.println("<h1> name of cookies 1 : " + name);

        writer.println("<br><br><a href='cookies2' >go to cookies 2 </a>");
    }
}
