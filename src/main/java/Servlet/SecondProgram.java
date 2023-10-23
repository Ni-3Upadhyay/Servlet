// Second method to create Servlet is by extending Generic Servlet

package Servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class SecondProgram extends GenericServlet { // Generic Servlet is a class that overrides all the method of Servlet Interface
//                                                        except service method.
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Generic Servlet called");

//       The method inside ServletResponse interface helps to print the text in response page.
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.println("Date : " + new Date().toString());
    }
}
