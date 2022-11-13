package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Role;
import com.activitiesManagement.entity.Users;
import com.activitiesManagement.service.UserService;
import com.activitiesManagement.service.implementation.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns ={ "/utilisateurs", "/editUser", "/deleteUser"})
public class UserServlet extends HttpServlet {
    UserService userService = new UserServiceImpl ();
    List< Users> usersList;
    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath ();

        switch (path){
            case "/utilisateurs":
                usersList = userService.getAll();

                request.setAttribute ( "usersList", usersList );
                request.getRequestDispatcher ( "/admin/utilisateurs.jsp" ).forward ( request, response );
                break;
            case "/deleteUser":
                int id = Integer.parseInt ( request.getParameter ( "id" ));
                userService.delete(id);
                usersList = userService.getAll();

                request.setAttribute ( "usersList", usersList );
                request.getRequestDispatcher ( "/admin/utilisateurs.jsp" ).forward ( request, response );
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath ();

        switch (path) {
            case "/editUser":
                Long id = Long.parseLong ( request.getParameter ( "id" ) );
                String firstname = request.getParameter ( "firstname" );
                String lastname = request.getParameter ( "lastname" );
                String email = request.getParameter ( "email" );
                String phone = request.getParameter ( "phone" );
                Boolean status = Boolean.parseBoolean ( request.getParameter ( "status"  ) );
                String roleName = request.getParameter ( "role" );
                Role role;
                if (roleName.equals ( "administrateur" )) {
                    role = new Role(Long.parseLong ( "2"), "administrateur");
                } else {
                    role = new Role(Long.parseLong ( "1"), "utilisateur");
                }

                Users user = new Users ( id, firstname, lastname, phone, null, email, null, status, role );

                userService.update(user);
                //System.out.println ( "id " + id + " " + firstname + " " + lastname + "" +
                //        " " + email + " " + phone + " " + status + " " + roleName );

                //System.out.println (  );
                List< Users> usersList = userService.getAll();

                request.setAttribute ( "usersList", usersList );
                request.getRequestDispatcher ( "/admin/utilisateurs.jsp" ).forward ( request, response );
                break;
        }
    }
}

