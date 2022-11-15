package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Participant;
import com.activitiesManagement.entity.Role;
import com.activitiesManagement.entity.Users;
import com.activitiesManagement.service.ParticipantService;
import com.activitiesManagement.service.implementation.ParticipantServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ParticipantServlet",  urlPatterns ={ "/participants", "/addParticipant" , "/editParticipant", "/deleteParticipant"})
public class ParticipantServlet extends HttpServlet {
     ParticipantService participantService =  new ParticipantServiceImpl();
    List<Participant> participantList;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paths = request.getServletPath ();

        switch (paths){
            case "/participants":
                participantList = participantService.getAll();

                request.setAttribute ( "participantList", participantList );
                request.getRequestDispatcher ( "/participant/participants.jsp" ).forward ( request, response );
                break;
            case "/deleteParticipant":
                int id = Integer.parseInt ( request.getParameter ( "id" ));
                participantService.delete(id);
                participantList = participantService.getAll();

                request.setAttribute ( "participantList", participantList );
                request.getRequestDispatcher ( "/participant/participants.jsp" ).forward ( request, response );
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String route = request.getServletPath ();

        String username;
        String password;

        Participant participant;
            switch (route) {

                case "/addParticipant":
                    System.out.println ("here" );
                    participant = new Participant();
                    String firstName = request.getParameter("firstName");
                    String lastName = request.getParameter("lastName");
                    String phones = request.getParameter("phone");
                    String emails = request.getParameter("email");
                    password = request.getParameter("password");
                    statu = request.getParameter("status");

                    participant.setFirstName(firstName);
                    participant.setLastName(lastName);
                    participant.setPhone(phones);
                    participant.setEmail(emails);
                    participant.setPassword(password);
                    Boolean status = Boolean.parseBoolean ( request.getParameter ( "status"  ) );
                    String roleName = request.getParameter ( "role" );
                    Role role;
                    if (roleName.equals ( "administrateur" )) {
                        role = new Role(Long.parseLong ( "2"), "administrateur");
                    } else {
                        role = new Role(Long.parseLong ( "1"), "utilisateur");
                    }
                    String structure =request.getParameter("structure");
                    Participant participants = new Participant ( id, firstname, lastname, phone, null, email, null, status, role,structure );
                    participantService.add(participant);
                    response.sendRedirect("login");

                    break;
            case "/editParticipant":
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
                String structure =request.getParameter("structure");
                Participant participants = new Participant ( id, firstname, lastname, phone, null, email, null, status, role,structure );

                participantService.update(participants);

                List<Participant> participantList = participantService.getAll();

                request.setAttribute ( "participantList", participantList );
                request.getRequestDispatcher ( "/participant/participants.jsp" ).forward ( request, response );
                break;
        }
    }
}
