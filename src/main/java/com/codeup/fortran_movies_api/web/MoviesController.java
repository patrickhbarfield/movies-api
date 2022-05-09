
package com.codeup.fortran_movies_api.web;
import com.codeup.fortran_movies_api.data.Movie;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@CrossOrigin //this is to help with local dev testing
@RestController
@RequestMapping(value = "/api/movies", headers = "Accept=application/json")
public class MoviesController {

    private List<Movie> sampleMovies = setMovies();

    @GetMapping("all")
    public List<Movie> getAll() {

        return sampleMovies;
    }

    @GetMapping("all") // Path becomes: /api/movies/all
//append to path or allow for path variables
    public List<Movie> getALL() {
        return new ArrayList<>();
    }

    @PostMapping
    public Movie one() {
        return sampleMovies.get(1);
    }

//    get Movie;

    private List<Movie> setMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "Pulp Fiction", "1994",
                "Quentin Tarentino", "Samuel L. Jackson, Uma Therman, Bruce Willis", "43", "dark comedy", "2 dudes recover a case"));
        return movies;
    }

    @PostMapping
    public void create(@RequestBody Movie movie) {
        sampleMovies.add(movie);
    }

    @PostMapping
    public void createAll(Movie movie) {

    }

    @PostMapping("all") // It's okay to have a POST and GET request mapped to the same route
    public void createAll(@RequestBody List<Movie> moviesToAdd) {
        System.out.println(moviesToAdd);
    }
}
