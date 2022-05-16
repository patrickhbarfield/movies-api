package com.codeup.fortran_movies_api.data;
import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    private String title;
//    private String year;
//    private String plot;
    private String poster;
    private String rating;

//    @ManyToOne // Many movies have the same director
//    @JsonIgonoreProperties("directedMovies")
//    private Director director;

   // TOD: We need to define the same many-to-many relationships, but form the Movie side (with a little less annotatoin fun)
        @ManyToMany(mappedBy = "movies", cascade - CascadeType.ALL) //
    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String director;
    private String year;

  /*  private String director;
    private String actors;
    private String imdbId;
    private String genre;*/
    private String plot;

    public Movie(int id, String title, String year, String plot, String poster, String rating) *String director, String actors, String imdbId, String genre,*/ String plot)

    {
        this.id = id;
        this.title = title;
        this.year = year;
        this.plot = plot;
        this.poster = poster;
        this.rating = rating;
    }
  /*      this.director = director;
        this.actors = actors;
        this.imdbId = imdbId;
        this.genre = genre;*/
        this.plot = plot;
    }

    public Movie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

  /*  public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }*/

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
/*                ", director='" + director + '\'' +
                ", actors='" + actors + '\'' +
                ", imdbId='" + imdbId + '\'' +
                ", genre='" + genre + '\'' +*/
                ", plot='" + plot + '\'' +
                '}';
    }
}
