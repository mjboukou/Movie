package GiveAnswer;

public class GiveAnswerFactory {

	public ShowAnswer createShowAnswer(String FileName ,String answer) {
		return new ShowAnswer(FileName ,answer);
	}
	public FileReader createFileReader(String path) {
		return new FileReader(path);
	}

}
