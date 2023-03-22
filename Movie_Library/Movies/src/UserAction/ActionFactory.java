package UserAction;

public class ActionFactory {

	public MovieUserAction createMovieTagAction(int userID , int movieID , int timestamp , int tagID , int tagWeight,String value) {
		return new MovieTagAction(userID , movieID , timestamp , tagID , tagWeight, value);
	}
	public MovieUserAction createMovieRatingAction(int userID , int movieID , int timestamp , int rating) {
		return new MovieRatingAction( userID ,  movieID , timestamp ,  rating);
	}
}
