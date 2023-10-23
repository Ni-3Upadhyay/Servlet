//      First method to create servlet is by implementing Servlet



package Servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstProgram implements Servlet {      // Servlet interface contain these 5 methods.

    ServletConfig con;

    @Override
    public void init(ServletConfig config) throws ServletException {
//        The first method that is called
        System.out.println("Init method is called first");
        con = config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//      after init service method is called.
        System.out.println("Service method is called");

//        ServletResponse interface contain many method like setContentType();
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("these three lines are used to show the content in the next page of servlet");
        System.out.println(getServletConfig());
        System.out.println(getServletInfo());

    }

    @Override
    public void destroy() {
//        Destroy method is called.
        System.out.println("After service method destroy method is called ");
    }


//    getServletConfig and getServletInfo are the non life cycle method.
    @Override
    public ServletConfig getServletConfig() {

        return con;
    }



    @Override
    public String getServletInfo() {
        return "My First Program";
    }


}
