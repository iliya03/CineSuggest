package in.technexo.cinephile.CineSuggest.dto;

import java.util.List;
import in.technexo.cinephile.CineSuggest.model.Movies;

public interface MovieDTO {
    List<Movies> getAllMovies();
    Movies getMovieById(int id);
    void saveMovie(Movies movieObj);
    void deleteMovie(int id);
	Movies updateMovie(Movies movieObj);
}