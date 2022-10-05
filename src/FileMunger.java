import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class FileMunger {
	public void mungeFile(String inFileName) throws IOException {
		Random rnd = new Random();
		FileInputStream fis = new FileInputStream(inFileName);
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fis.read()) != -1) {
			sb.append((char)ch);
			sb.append(rnd.nextInt(10));
		}
		fis.close();
		
		String outFileName = inFileName + "_munged";
		FileOutputStream fos = new FileOutputStream(outFileName);
		fos.write(sb.toString().getBytes());
		fos.close();
	}
	
	public static void main(String[] args) throws IOException {
		new FileMunger().mungeFile("declaration.txt");
	}
}
