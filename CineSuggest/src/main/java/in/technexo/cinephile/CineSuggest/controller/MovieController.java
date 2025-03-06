package in.technexo.cinephile.CineSuggest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.technexo.cinephile.CineSuggest.model.Movies;
import in.technexo.cinephile.CineSuggest.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/movies")
	public List<Movies> get() {
		
		return movieService.getAllMovies();
		
		}
	
	@PostMapping("/add")
	public Movies saveMovie(@RequestBody Movies movieObj) {
		movieService.saveMovie(movieObj);
		return movieObj;
		
	}
	
	@GetMapping("/movies/{id}")
	public Movies getMovieById(@PathVariable int id) {
		Movies movieObj =  movieService.getMovieById(id);
		if(movieObj == null) {
			throw new RuntimeException("Movies with id:"+ id + "is not found!");
		}
		return movieObj;
	}
	
	@DeleteMapping("/movies/{id}")
	public String deleteMovie(@PathVariable int id) {
		 movieService.deleteMovie(id);
		 return "Movies has been deleted with id:" + id;
		
	}
	
	@PutMapping("/movies")
	public Movies updateMovie (@RequestBody Movies movieObj) {
		movieService.updateMovie(movieObj);
		return movieObj;
	}
	
}
