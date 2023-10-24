package SessionTracking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tracking2")
public class Servlet2 extends HttpServlet {

//    Anchor tag calls the get method so here we are overriding doGet method
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("Name of servlet 2 : " + name);

        writer.println("<br><br><a href='tracking2'>go to Servlet 2 </a>");
    }
}
