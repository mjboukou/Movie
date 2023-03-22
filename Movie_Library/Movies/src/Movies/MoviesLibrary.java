package Movies;

import java.util.ArrayList;

import GiveAnswer.FileReader;
import GiveAnswer.ShowAnswer;

public class MoviesLibrary {

	public static void main(String[] args) {
		FileReader fr = new FileReader();
		Movie m = new Movie(1,"2","3","5");
		int a =m.getMovieID();
		ArrayList<Movie> movies = new ArrayList<Movie>();
		ManageMovies manage = new ManageMovies(movies);
		ShowAnswer s = new ShowAnswer();

	}

}
