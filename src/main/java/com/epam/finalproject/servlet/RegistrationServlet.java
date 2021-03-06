package com.epam.finalproject.servlet;

import com.epam.finalproject.domain.User;
import com.epam.finalproject.repository.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/registration"})
public class RegistrationServlet extends HttpServlet {

    private UserRepository userRepository;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = userRepository.getAllUser();

        req.setAttribute("users",userList);

        req.getServletContext().getRequestDispatcher("/registration.jsp").forward(req,resp);
    }
}
