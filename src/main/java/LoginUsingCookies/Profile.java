package LoginUsingCookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile")
public class Profile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie [] cookie = req.getCookies();

        if(cookie.length==0){
            resp.sendRedirect("LoginCookies.html");
        }
        else{

            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();

            writer.println("<h1>UserName : "+ cookie[0].getValue() + "</h1>");
            writer.println("<h1>Password : " + cookie[1].getValue() + "</h1>");

            writer.println("<a href='logout'>Log out</a>");
        }
    }
}
