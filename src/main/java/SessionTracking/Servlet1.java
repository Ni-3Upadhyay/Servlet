// In this we are not able to access the data of user in Servlet 2 so here session tracking is not available
// we are getting the data in servlet1 but not in servlet2.

//Session Tracking can be achieved in 4 ways :
//   1.-  Cookies
//   2.-  Hidden Form Field
//   3.-  URL rewriting
//   4.-  Http Session



package SessionTracking;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/tracking1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("Name of servlet 1 : " + name);

        writer.println("<br><br><a href='tracking2'>go to Servlet 2 </a>");         // anchor tag always calls get method by default
                                                                                // so we need to create doGet method in servlet2
    }
}
