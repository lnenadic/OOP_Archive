package Rok_4_21.ZD4;

import java.util.ArrayList;
import java.util.HashMap;

public class DB_Movies {

    // nepotpuno?!

    private HashMap<Movie, ArrayList<Actor>> movies;

    public DB_Movies() {

    }

    public void putMovies2DB(Movie mv) {
        movies.put(mv, mv.getListOfActors());
    }

    public void listAllMovies4Actor(Actor ac) {

    }

    public HashMap<Movie, ArrayList<Actor>> getMovies() {
        return movies;
    }
}
