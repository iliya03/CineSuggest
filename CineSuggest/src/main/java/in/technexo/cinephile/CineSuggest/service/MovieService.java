package in.technexo.cinephile.CineSuggest.service;

import java.util.List;
import in.technexo.cinephile.CineSuggest.model.Movies;

public interface MovieService {
	List<Movies> getAllMovies();
    Movies getMovieById(int id);
    void saveMovie(Movies movieObj);
    void deleteMovie(int id);
	void updateMovie(Movies movieObj);
    
}
