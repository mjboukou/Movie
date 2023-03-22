package UserAction;

public abstract class MovieUserAction {

	private int userID;
	private int movieID;
	private int timestamp;
	
	public abstract String findAction();
	
	public MovieUserAction() {
		
	}
	
	public MovieUserAction(int userID ,int movieID , int timestamp) {
		
	}
	
	public String toString() {
		
	}

}
