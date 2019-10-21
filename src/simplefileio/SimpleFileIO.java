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
		filename = "Data/test2.csv";
		FileImporter.readCarsCSV(filename);
		String tmpDoor = StringParserHelper.getNumOfDoors("RX-8 4dr automatic");
		System.out.println(tmpDoor);
		
	}
	
	static class StringParserHelper {
		public static String getNumOfDoors(String carString) {
			String retValDoors = "";
			//RSX Type S 2dr
			// MDX
			//RX-8 4dr automatic
			if (carString.contains("dr")) {
				int idx = carString.indexOf("dr");
		retValDoors = carString.substring(idx-1,idx);
			}

			return retValDoors;
		}
	}
	
	static class FileImporter {
		public static void readCarsCSV(String filename) throws FileNotFoundException {
			// bruge scanner
			String line = "";
			File fh = new File(filename);
			Scanner myScanner = new Scanner(fh);
			while(myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				System.out.println(line);
			}

		}
	}
	
}
