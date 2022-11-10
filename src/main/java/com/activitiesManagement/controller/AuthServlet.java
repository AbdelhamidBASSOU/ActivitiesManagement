package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Role;
import com.activitiesManagement.entity.Users;
import com.activitiesManagement.service.*;
import com.activitiesManagement.service.implementation.UserServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AuthServlet", urlPatterns ={ "/AuthServlet", "/login"})
public class AuthServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath ();
        switch (path){
            case "/login":
                request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
                break;
            case "/AuthServlet":
                this.getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
                break;
            default :

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println ("1" );
        String path = request.getServletPath ();
        String username;
        String password;
        Users user;
        switch (path) {
            case "/AuthServlet":
                System.out.println ("here" );
                user = new Users();
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String phone = request.getParameter("phone");
                username = request.getParameter("username");
                String email = request.getParameter("email");
                password = request.getParameter("password");
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setPhone(phone);
                user.setUsername(username);
                user.setEmail(email);
                user.setPassword(password);
                user.setRole(new Role((long) 1));
                userService.add(user);
                break;
            case "/login":
                System.out.println ("2" );
                username = request.getParameter ( "username" );
                password = request.getParameter ( "password" );

                user = new Users ( username, password );

                user = userService.login(user);

                if(user != null){
                    if(password.equals ( user.getPassword () )){
                        HttpSession session = request.getSession( );
                        session.setAttribute("user", user);
                        request.setAttribute ( "user", user );
                        request.getRequestDispatcher("/shared/dashboard.jsp").forward(request, response);
                    }
                    else {
                        request.setAttribute ( "errorMessage", "information invalide" );
                        request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
                    }
                } else {
                    request.setAttribute ( "errorMessage", "Username incorrect" );
                    request.getRequestDispatcher("/auth/login.jsp").forward(request, response);
                }
                break;
            default:

        }



    }
}
