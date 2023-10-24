package ParameterAndArguments;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/servlet3")
public class Servlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int a = Integer.parseInt(req.getParameter("first"));   // return type is String so need to use parseInt.

        int b = Integer.parseInt(req.getParameter("second"));

        int sum = (Integer)(req.getAttribute("sum"));     // getAttribute is of object type so type conversion is simple

        int mul = a*b;

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println("<h1> Sum : " + sum +"</h1>");
        writer.println("<h1> multiplication : " + mul +"</h1>");

    }
}
