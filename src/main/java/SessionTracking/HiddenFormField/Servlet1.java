package SessionTracking.HiddenFormField;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hidden1")
public class Servlet1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String  name = req.getParameter("name");

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        writer.println("<form action='hidden2' >" +
                "<input type='hidden' name='uname' value='"+name+"'>" +
                "<button type='submit'>to next page</button> </form>");

    }
}
