package in.technexo.cinephile.CineSuggest.dto;

import java.util.List;

import org.springframework.stereotype.Repository;
import in.technexo.cinephile.CineSuggest.model.Movies;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class MovieDTOImpl implements MovieDTO {
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Movies> getAllMovies() {
        return entityManager.createQuery("FROM Movies", Movies.class).getResultList();
    }

    @Override
    public Movies getMovieById(int id) {
       return entityManager.find(Movies.class, id);
    }

    @Override
    public void saveMovie(Movies movieObj) {
        entityManager.persist(movieObj);
    }
    
    @Override
    public Movies updateMovie(Movies movieObj) {
        return entityManager.merge(movieObj); 
    }

    @Override
    public void deleteMovie(int id) {
       Movies movie = entityManager.find(Movies.class, id);
       if(movie != null) {
    	   entityManager.remove(movie);
       }
    }

}
