package simplefileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileIO {
	
	static String filename;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO code application logic here
		filename = "Data/test.csv";
		MyFileIO.readFromFile(filename);
	}
	
	static class StringParsing {
		
		public static void getNumOfDoors(String myString) {
			/*
			find tallet umiddelbart før dr - hvis dr forekommer
			S80 2.5T 4dr
			Focus ZX5 5dr
			IS 300 4dr manual
			Forester X
			*/

			
			
		}
	}
	
	
	static class MyFileIO {
		
		public static void readFromFile(String filename) throws FileNotFoundException {
			File file = new File(filename);
			Scanner myScanner = new Scanner(file);
			String line = "";
			System.out.println("iinto write");
			while (myScanner.hasNextLine()){
				line = myScanner.nextLine();
				System.out.println(line);
			}
			
			
		}
	}
	
}
