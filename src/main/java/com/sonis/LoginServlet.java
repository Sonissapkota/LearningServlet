package com.sonis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        PrintWriter out = res.getWriter();

        if(username.equals("sonis@gmail.com") && password.equals("sonis")){
            RequestDispatcher rd = req.getRequestDispatcher("/profile.html");
            rd.forward(req,res);
        }else{
            res.setContentType("text/html");
            out.print("<h3>Username or password is incorrect</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req,res);
        }
    }
}
