package com.sonis;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/submitform")
public class HelloServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");

        System.out.println("Name"+ name);
        System.out.println("Address"+ address);

        PrintWriter out = res.getWriter();
        out.print("Name"+ name);
        out.print("Address"+ address);
    }
}
