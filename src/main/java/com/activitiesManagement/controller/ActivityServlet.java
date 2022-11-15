package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.entity.Participant;
import com.activitiesManagement.service.ActivityService;
import com.activitiesManagement.service.ExerciceService;
import com.activitiesManagement.service.ParticipantService;
import com.activitiesManagement.service.implementation.ActivityServiceImpl;
import com.activitiesManagement.service.implementation.ExerciceServiceImp;
import com.activitiesManagement.service.implementation.ParticipantServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ActivityServlet", urlPatterns ={ "/activities", "/addActivity" ,"/deleteActivity", "/editActivity"})
public class ActivityServlet extends HttpServlet {

    ActivityService activityService = new ActivityServiceImpl( );
    ExerciceService exerciceService = new ExerciceServiceImp ();
    ParticipantService participantService = new ParticipantServiceImpl ();
    Activity activity;

    List< Activity> activityList;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String route = request.getServletPath ();
        switch (route){
            case "/activities":
                List<Activity> activityList = activityService.getAll();
                request.setAttribute ( "activityList", activityList );

                List<Exercise> exerciseList = exerciceService.getAll();
                List<Participant> participants = participantService.getAll();

                request.setAttribute ( "exerciceList", exerciseList );
                request.setAttribute ( "participantsList", participants );
                request.getRequestDispatcher("/activity/activities.jsp").forward(request, response);
                break;
            case  "/addActivity":
                request.getRequestDispatcher("/activity/addActivity.jsp").forward(request, response);
                break;
            case  "/deleteActivity" :
                int id = Integer.parseInt ( request.getParameter ( "id" ));
                System.out.println ("this is servlet : " + id );
                activityService.delete(id);
                activityList = activityService.getAll();
                request.setAttribute ( "activityList", activityList );
                request.getRequestDispatcher("/activity/activities.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String route = request.getServletPath ();
        switch (route){
            case "/addActivity":
                LocalDate dateDebut = LocalDate.parse (request.getParameter ( "dateDebut" ));
                LocalDate dateFin = LocalDate.parse ( request.getParameter ( "dateFin" ));
                String description = request.getParameter ( "description" );
                Boolean status = Boolean.parseBoolean ( request.getParameter ( "status" ));
                String title = request.getParameter("title");
                Long idExercice = Long.parseLong ( request.getParameter ( "exercice" ));
                String participants = request.getParameter ( "participantList" );

                String[] idParticipants = participants.split ( ";" );
                List<Participant> participantList = new ArrayList <> ();
                for ( String idParticipant : idParticipants ) {
                    participantList.add ( new Participant ( Long.parseLong ( idParticipant ) ) );
                }


                activity = new Activity (  );
                        activity.setDateDebut(dateDebut);
                        activity.setDateFin(dateFin);
                        activity.setDescription(description);
                        activity.setStatus(status);
                        activity.setTitle(title);
                        activity.setExercise(new Exercise((long) 3));
                        activity.setParticipantList(participantList);
                activityService.add(activity);

                break;
            case "/editActivity":
                LocalDate date_Debut = LocalDate.parse (request.getParameter ( "dateDebut" ));
                LocalDate date_Fin = LocalDate.parse ( request.getParameter ( "dateFin" ));
                String descriptions = request.getParameter ( "description" );
                Boolean statu = Boolean.parseBoolean ( request.getParameter ( "status" ));
                String titles = request.getParameter("title");
                activity = new Activity (  );
                activity.setDateDebut(date_Debut);
                activity.setDateFin(date_Fin);
                activity.setDescription(descriptions);
                activity.setStatus(statu);
                activity.setTitle(titles);
                activity.setExercise(new Exercise((long) 1));
                //  activity.setParticipantList((List<Participant>) new Participant());
                activityService.update(activity);


                activityList = activityService.getAll();
                request.setAttribute ( "activityList", activityList );
                request.getRequestDispatcher("/activity/activities.jsp").forward(request, response);

                break;
        }
    }
}
