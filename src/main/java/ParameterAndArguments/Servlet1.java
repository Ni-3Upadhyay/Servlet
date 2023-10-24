
// method getParameter is used to get the values given by the user in the form.

//There are mainly three methods for attribute

// setAttribute() :- takes two argument name by which the value is known and the value needed to be passed to next servlet.
// getAttribute() :- takes one argument the name of the value we need to use in next servlet.
// removeAttribute() :- so that the next servlet won't get that attribute


package ParameterAndArguments;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int a = Integer.parseInt(req.getParameter("first"));

        int b = Integer.parseInt(req.getParameter("second"));

        int sum = a+b;

        req.setAttribute("sum", sum);       // this sets the attribute name for the sum.
                                                // first parameter the name and the second attribute the value.

        RequestDispatcher dispatcher = req.getRequestDispatcher("servlet3");
        dispatcher.forward(req, resp);
    }
}
