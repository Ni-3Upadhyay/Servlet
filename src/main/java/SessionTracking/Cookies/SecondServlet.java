package SessionTracking.Cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/cookies2")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        Cookie [] ck = req.getCookies();       // getCookies returns array type.

        writer.println("<h1> name of cookies 2 : " + ck[0].getValue());

        writer.println("<br><br><a href='cookies2' >go to cookies 2 </a>");
    }
}
