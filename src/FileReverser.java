import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReverser {

	public static void main(String[] args) throws IOException {
		String inFileName = args[0];
		String outFileName = inFileName + "_reversed";
		
		FileInputStream fis = new FileInputStream(inFileName);
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fis.read()) != -1) {
			sb.append((char)ch);
		}
		fis.close();
		sb.reverse();
		
		FileOutputStream fos = new FileOutputStream(outFileName);
		fos.write(sb.toString().getBytes());
		fos.close();
	}



}
