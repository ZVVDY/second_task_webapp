package com.academy_it;

import com.academy_it.model.entity.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = ("/login"))
public class LoginServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        req.setAttribute("login", login);
        req.setAttribute("password", password);
        try {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
            requestDispatcher.forward(req, resp);
        }
        catch (IOException | ServletException e) {
            System.out.println("Error not file");
        }
        HttpSession session = req.getSession();
        User userTemp = new User(login, password);
        session.setAttribute("userTemp", userTemp);
        Cookie cookie = new Cookie("login", login);
        Cookie cookie1 = new Cookie("password", password);
        resp.addCookie(cookie);
        resp.addCookie(cookie1);
    }
}

