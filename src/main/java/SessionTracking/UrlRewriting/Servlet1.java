package SessionTracking.UrlRewriting;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlRewriting")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1> " + name+ "</h1>");
        writer.println("<a href='urlRewriting2?username=" +name+ "'>click</a>");

    }
}
