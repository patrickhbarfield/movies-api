import javax.persistence.*;

@Entity
@Table(name="movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String director;
}

public class MoviesController {
    @GetMapping("{id}")
    public Movie getById(@PathVariable int id) {

    }


    @PostMapping
    public void create(@RequestBody Movie movie){

    }

    @PostMapping
    public void createMany(List<Movie> movies){
        System.out.println(movies);
    }
}
