// @WebServlet is used for mapping

package AnnotationBased;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/webServlet")                          // The path to access this page is given in place of xml mapping
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

//    ******   this is used to redirect to next page the data is transfer as well  **********  //

//            dispatcher = req.getRequestDispatcher("servlet2");
//            dispatcher.forward(req, resp);

//   ******    this is used to redirect to next page the data is not transfered because it creates a new object at every call

            resp.sendRedirect("servlet2");

        }else {
//            redirect to same page
            writer.println("Invalid user or password");
            dispatcher = req.getRequestDispatcher("RequestDispatcher.html");
            dispatcher.include(req, resp);

        }
    }
}
