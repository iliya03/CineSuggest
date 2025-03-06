package in.technexo.cinephile.CineSuggest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "moviedb")
	public class Movies {
	    
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column
	    private Long id;
		
		@Column
	    private String title;
	    
		@Column
		private String director;
	    
		@Column
		private String genre;
	    
		@Column
		private int releaseYear;
	    
		@Column
		private double rating;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public int getReleaseYear() {
			return releaseYear;
		}

		public void setReleaseYear(int releaseYear) {
			this.releaseYear = releaseYear;
		}

		public double getRating() {
			return rating;
		}

		public void setRating(double rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "Movies [id=" + id + ", title=" + title + ", director=" + director + ", genre=" + genre
					+ ", releaseYear=" + releaseYear + ", rating=" + rating + "]";
		}
		

	    
	}

