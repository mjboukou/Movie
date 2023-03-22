package Movies;

import java.util.ArrayList;

public class MoviesFactory {
	public Movie createMovie(int movieID , String directorID , String directorName ,String country){
		return new Movie(movieID,directorID,directorName,country);
	}
	public ManageMovies createManageMovies(ArrayList<Movie> movies) {
		return new ManageMovies(movies);
	}
}
