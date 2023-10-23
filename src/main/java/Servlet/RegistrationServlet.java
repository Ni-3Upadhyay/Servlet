package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Here whatever the userInput is stored in req
//        Here the dynamic response is given using resp


        String name = req.getParameter("name");         // as the req contain the user input now we need to store that in variable
        String email = req.getParameter("email");       // get parameter method is used for that
        String password = req.getParameter("password"); // the arguments passed are the html file name.
        String course = req.getParameter("course");

//        Now to provide response to user in the new page.

        resp.setContentType("text/html");       // this will provide a new Html page

        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Name : "+name+" </h1>");
        writer.println("<h1>email : "+ email + "</h1>");
        writer.println("<h1>password : "+ password +"</h1>");
        writer.println("<h1>course : "+course +"</h1>");

    }
}
