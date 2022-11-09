package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Activity;
import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.service.ActivityService;
import com.activitiesManagement.service.implementation.ActivityServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "ActivityServlet", urlPatterns ={ "/activities", "/addActivity"})
public class ActivityServlet extends HttpServlet {

    ActivityService activityService = new ActivityServiceImpl( );
    Activity activity;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String route = request.getServletPath ();
        switch (route){
            case "/activities":
                List<Activity> activityList = activityService.getAll();
                request.setAttribute ( "activityList", activityList );
                request.getRequestDispatcher("/activity/activities.jsp").forward(request, response);
                break;
            case  "/addActivity":
                request.getRequestDispatcher("/activity/addActivity.jsp").forward(request, response);
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


                activity = new Activity (  );
                        activity.setDateDebut(dateDebut);
                        activity.setDateFin(dateFin);
                        activity.setDescription(description);
                        activity.setStatus(status);
                        activity.setTitle(title);
                        activity.setExercise(new Exercise((long) 1));
                       // activity.setParticipantList();
                activityService.add(activity);
                break;
        }
    }
}
