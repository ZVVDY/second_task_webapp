package com.academy_it;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Login and password entry servlet
 */
@WebServlet(urlPatterns = "/loginForm")
public class LoginFormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/jsp/loginForm.jsp");
            requestDispatcher.forward(req, resp);
        } catch (IOException | ServletException e) {
            System.out.println("Error not file");
        }
    }
}
