package AnnotationBased;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/servlet2")                            // in place of the URL mapping in xml file we can directly use this annotation.
public class secondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.println(req.getParameter("email"));
        writer.println("Welcome to Home page");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        resp.setContentType("text/html");


        PrintWriter writer = resp.getWriter();
        writer.println(req.getParameter("email"));
        writer.println("Welcome to Home page");
    }
}
