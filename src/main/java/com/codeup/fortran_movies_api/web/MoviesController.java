
package com.codeup.fortran_movies_api.web;
import com.codeup.fortran_movies_api.data.Movie;
import com.codeup.fortran_movies_api.data.MovieRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin //this is to help with local dev testing
@RestController
@RequestMapping(value = "/api/movies", headers = "Accept=application/json")
public class MoviesController {

    private final MovieRepository movieRepository;
/*
//    private final DirectorRespository directorRepository;
*/

//    public MoviesController(MovieRepository movieRepository, DirectorRespository directorRespository) {
       this.movieRepository = movieRepository;
//        this.directorRepository = directorRespository;
//    }
public List<Movie> getByYearRange(@RequestParam("startYear") return movieRepository.findByYearRange
    @GetMapping("id")
    public Movie getById(@PathVariable int id) {
        return MovieRepository.getById(id);
    }

    @GetMapping("all") // Path becomes: /api/movies/all
//append to path or allow for path variables
    public List<Movie> getALL() {
        return movieRepository.findAll();
    }

    @GetMapping("search")
    public Movie findByTitle(@RequestParam("title") String title) {
        return MovieRepository.findByTitle("title");
    }

    // adding this search/year will append to /api/movie
    @GetMapping("search/year")
    public List<Movie> getByDateYearRange(@RequestParam("startDate") String startYear, @RequestParam("endYear") String endYear) {
        return movieRepository.findByYearRange(startYear, endYear);
    }

/*    @GetMapping("search/director")
    public List<Director> getByDirector(@RequestParam("name") String directorName) {
        return movieRepository.getByDirector("name");
    }*/

//@GetMapping('language')
//public Movie getByLanguage(@PathVariable string id) {
//        return movieRepository.getByLanguage();

/*@GetMapping("search")
public Movie getByTitle(@RequestParam("Title") String title){
        Movie movieToReturn = null;

        for(Movie)
}
    private List<Movie> setMovies() {
        List<Movie> movies = new ArrayList<>();

      /*  movies.add(new Movie(1, "Pulp Fiction", "1994",
                "Quentin Tarentino", "Samuel L. Jackson, Uma Therman, Bruce Willis", "43", "dark comedy", "2 dudes recover a case"));*/

    @PostMapping
    public void create(@RequestBody Movie movie) {
        movieRepository.add(movie);
    }

    @PostMapping
    public void createAll(Movie movie) {

    }

    @PostMapping("all") // It's okay to have a POST and GET request mapped to the same route
    public void createAll(@RequestBody List<Movie> moviesToAdd) {
        System.out.println(moviesToAdd);
    }

}
