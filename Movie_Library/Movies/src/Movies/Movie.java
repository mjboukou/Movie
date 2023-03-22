package Movies;
import java.util.ArrayList;
import java.util.HashMap;

import GiveAnswer.FileReader;
import UserAction.MovieUserAction;

public class Movie {
	
	private int movieID;
	private String directorID;
	private String directorName;
	private String movieInfo;
	private ArrayList<String> genres = new ArrayList<String>();
	private ArrayList<String> filmingLocations = new ArrayList<String>();
	private ArrayList<String> actors = new ArrayList<String>();
	private ArrayList<MovieUserAction> tags = new ArrayList<MovieUserAction>();
	private ArrayList<MovieUserAction> ratings = new ArrayList<MovieUserAction>();
	private String country;
	
	public Movie() {
		
	}
	public Movie(int movieID , String directorID , String directorName ,String country) {
		
	}
	public void fillTags(ArrayList<MovieUserAction> allTags) {
		
	}
	
	public void fillRatings(ArrayList<MovieUserAction> allRatings) {
		
	}
	public void loadInfo() {
		FileReader fr = new FileReader();
		
	}
	public int getMovieID(){
		return movieID;
	}
	public String getDirectorID(){
		return directorID;
	}
	public String getMovieInfo() {
		return movieInfo;
	}
	public ArrayList<String> getGenres(){
		return genres;
	}
	public ArrayList<String> getActors(){
		return actors;
	}
	
	public ArrayList<String> getFilmingLocations(){
		return filmingLocations;
	}	
	public String toString() {
		return " ";
	}
}
