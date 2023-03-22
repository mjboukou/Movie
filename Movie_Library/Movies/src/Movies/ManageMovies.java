package Movies;

import java.util.ArrayList;
import java.util.HashMap;

public class ManageMovies {
	private HashMap<String,ArrayList<Movie>> genre_Movies  = new HashMap<String,ArrayList<Movie>>();
	private HashMap<String,ArrayList<Movie>> actor_Movies  = new HashMap<String,ArrayList<Movie>>();
	private HashMap<String,ArrayList<Movie>> director_Movies  = new HashMap<String,ArrayList<Movie>>();
	private HashMap<String,ArrayList<Movie>> counrty_Movies  = new HashMap<String,ArrayList<Movie>>();
	private HashMap<String,ArrayList<Movie>> filmingLocations_Movies  = new HashMap<String,ArrayList<Movie>>();
	private ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public ManageMovies(ArrayList<Movie> movies) {
		
	}
	public void fillHashMaps(){
		
	}
	public String find_description(int movieID) {
		return "1";
	}
	
	public String find_description(String title) {
		return "1";
	}
	
	public String find_genreMovies(String genre) {
		return "1";
	}
	
	public String find_countryMovies(String country) {	
		return "1";
	}
	
	public String find_actorMovies(String actorName) {
		return "1";
	}
	
	public String find_directorMovies(String directorName) {
		return "1";
	}
	
	public String find_movieTags(int movieID) {
		return "1";
		
	}
	public String find_movieTags(String title) {
		return "1";
	}
	
	public String find_movieRatings(int movieID) {
		return "1";
		
	}
	public String find_movieRatings(String title) {
		return "1";
	}
	
}
