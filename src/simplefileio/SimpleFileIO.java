package simplefileio;
import java.io.File;
import java.util.Scanner;

public class SimpleFileIO {
	
	static String filename;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		filename = "Data/test.csv";
		MyFileIO.readFromFile(filename);
	}
	
	static class MyFileIO {
		
		public static void readFromFile(String filename) {
			Scanner myScanner = new Scanner(filename);
			String line = "";
			while (myScanner.hasNextLine()){
				line = myScanner.nextLine();
				System.out.println(line);
			}
			
			
		}
	}
	
}
