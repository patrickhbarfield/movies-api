package com.codeup.fortran_movies_api.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface MovieRepository extends JpaRepository<Movie, Long> {

List<Movie> findByTitle(String title);
List<Movie> getById(Integer id);
List<Movie> add();

@Query(nativeQuery = true,
value = "SELECT * FROM movies m\n" +
        "WHERE CAST(m.year AS UNSIGNED) >= :startYear AND CAST(m.year AS UNSIGNED) <= :endYear;")
List<Movie> findByYearRange(String startYear, String endYear);

    void add(Movie movie);
}
