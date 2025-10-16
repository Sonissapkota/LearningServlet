package com.sonis;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("user");
        String password = req.getParameter("pass");
        PrintWriter out = resp.getWriter();

        if(username.equals("sonis@gmail.com") && password.equals("sonis")){
            HttpSession session = req.getSession();
            session.setAttribute("user_key", username);
            RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
            rd.forward(req,resp);
        }else{
            resp.setContentType("text/html");
            out.print("<h3>Username or password is incorrect</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
            rd.include(req,resp);
        }
    }
}
