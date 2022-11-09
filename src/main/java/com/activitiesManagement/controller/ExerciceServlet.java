package com.activitiesManagement.controller;

import com.activitiesManagement.entity.Exercise;
import com.activitiesManagement.service.ExerciceService;
import com.activitiesManagement.service.implementation.ExerciceServiceImp;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "ExerciceServlet", urlPatterns ={ "/exercices", "/addExercice"})
public class ExerciceServlet extends HttpServlet {
    ExerciceService exerciceService = new ExerciceServiceImp ( );
    Exercise exercice;

    @Override
    protected void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String path = request.getServletPath ();
        switch (path){
            case "/exercices":
                List< Exercise> exerciseList = exerciceService.getAll();
                request.setAttribute ( "exerciceList", exerciseList );
                request.getRequestDispatcher("/exercice/exercices.jsp").forward(request, response);
                break;
            case  "/addExercice":
                request.getRequestDispatcher("/exercice/addExercice.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getServletPath ();

        switch (path){
            case "/addExercice":
                String year = request.getParameter ( "year" );
                LocalDate dateDebut = LocalDate.parse (request.getParameter ( "dateDebut" ));
                LocalDate dateFin = LocalDate.parse ( request.getParameter ( "dateFin" ));
                Boolean status = Boolean.parseBoolean ( request.getParameter ( "status" ));

                //System.out.println ("year: " + year + " date debut : " + dateDebut + "" +
                //        "date fin: " + dateFin + "" +
                //        "status : " + status );
                exercice = new Exercise ( year, dateDebut, dateFin, status );

                exerciceService.add(exercice);
                break;
        }
    }
}
