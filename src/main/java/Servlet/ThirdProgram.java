//Third way to create servlet is by extending HttpServlet

package Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThirdProgram extends HttpServlet { // this extends the GenericServlet so here we can directly access the
//    Http specific methods.

//    Here service method works internally according to the request calls the doGet method or doPost method that we have
//    given in html file.
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do get Method Called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Do post Method called");
    }
}
