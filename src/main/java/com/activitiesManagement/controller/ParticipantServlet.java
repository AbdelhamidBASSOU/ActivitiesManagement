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
        String path = request.getServletPath ();

        switch (path){
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
            case "/addParticipant":
                request.getRequestDispatcher ( "/participant/addParticipant.jsp" ).forward ( request, response );
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getServletPath ();

        String username;
        String password;

            switch (path) {
                case "/addParticipant":
                    System.out.println ("this is participant servlet" );
                    String firstname = request.getParameter("firstname");
                    String lastname = request.getParameter("lastname");
                    String phone = request.getParameter("phone");
                    String email = request.getParameter("email");
                    password = request.getParameter("password");
                    username = request.getParameter ( "username" );
                    String domaine = request.getParameter ( "domaine" );
                    String structure = request.getParameter ( "structure" );
                    Boolean status = Boolean.parseBoolean ( request.getParameter ( "status" ) );
                    Role role = new Role(Long.parseLong ( "1" ));

                    Participant participant = new Participant (  );

                    participant.setFirstName ( firstname );
                    participant.setLastName ( lastname );
                    participant.setEmail ( email );
                    participant.setPassword ( password );
                    participant.setPhone ( phone );
                    participant.setUsername ( username );
                    participant.setDomain ( domaine );
                    participant.setStructure ( structure );
                    participant.setState (status);

                    System.out.println (participant.toString () );
                    participantService.add(participant);

                    participantList = participantService.getAll();

                    request.setAttribute ( "participantList", participantList );
                    request.getRequestDispatcher ( "/participant/participants.jsp" ).forward ( request, response );

                    break;
            case "/editParticipant":
                System.out.println ("7ta tekhdem l edit" );
                break;
        }
    }
}
