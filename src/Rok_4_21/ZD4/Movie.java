package Rok_4_21.ZD4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Movie {

    private String movieTitle;
    private int id;
    private static int cnt = 0;
    private ArrayList<Actor> listOfActors = new ArrayList<>();
    private Date yearReleased;
    private Director director;

    public Movie(String title, String year, Director dir) {
        director = dir;
        movieTitle = title;
        try {
            yearReleased = new SimpleDateFormat("dd/MM/yyyy").parse(year);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        id = cnt++;
    }

    public void addActor(Actor act) {
        listOfActors.add(act);
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public Director getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", id=" + id +
                ", listOfActors=" + listOfActors +
                ", yearReleased=" + yearReleased +
                ", director=" + director +
                '}';
    }
}
