package com.activitiesManagement.controller;
import com.activitiesManagement.entity.Users;
import com.activitiesManagement.service.*;
import com.activitiesManagement.service.implementation.UserServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "AuthServlet", value = "/AuthServlet")
public class AuthServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      Users user =new Users();
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
           user.setFirstName(firstName);
           user.setLastName(lastName);
           user.setPhone(phone);
           user.setUsername(username);
           user.setEmail(email);
           user.setPassword(password);
        userService.add(user);

    }
}
