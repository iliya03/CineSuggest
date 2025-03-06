package in.technexo.cinephile.CineSuggest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.technexo.cinephile.CineSuggest.dto.MovieDTO;
import in.technexo.cinephile.CineSuggest.model.Movies;


@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieDTO movieDTO;
	
	@Transactional
	@Override
	public List<Movies> getAllMovies() {
		
		return movieDTO.getAllMovies();
		
	}
	
	@Transactional
	@Override
	public Movies getMovieById(int id) {
		return movieDTO.getMovieById(id);
	}
	
	@Transactional
	@Override
	public void saveMovie(Movies movieObj) {
		movieDTO.saveMovie(movieObj);
	}
	
	@Transactional
	@Override
	public void deleteMovie(int id) {
		movieDTO.deleteMovie(id);
		
	}
	
	@Transactional
	@Override
	public void updateMovie(Movies movieObj) {
		movieDTO.updateMovie(movieObj);
		
	}
	
	

}
