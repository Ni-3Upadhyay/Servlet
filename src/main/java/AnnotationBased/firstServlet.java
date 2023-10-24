package RequestDispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class firstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


        RequestDispatcher dispatcher;       // is an interface helps to redirect to other page using forward and include method

        if(email.equals("umesh4n9@gmail.com")  && password.equals("password")){
//            redirect to next page

            dispatcher = req.getRequestDispatcher("servlet2");
            dispatcher.forward(req, resp);

        }else {
//            redirect to same page
            writer.println("Invalid user or password");
            dispatcher = req.getRequestDispatcher("RequestDispatcher.html");
            dispatcher.include(req, resp);

        }
    }
}
