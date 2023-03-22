package GiveAnswer;

import java.io.File;

public interface PdfExtractor {
	public void ShowPdfAnswer(String answer , String pdfName);
	public void ConvertToPdf(File nameFile , String pdfName);
}
