package simplefileio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileIO {
	
	static String filename;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO code application logic here
		String filename = "Data/test2.csv";
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
	
	static class FileExporter {
		public static void makeHTML(String line, String filename) throws IOException {
			// "Data/index.html"
			File fh = new File(filename);
			FileWriter fw = new FileWriter(fh,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(line);
			bw.newLine();
			bw.close();
		} 

	}
	
	static class FileImporter {
		public static void readCarsCSV(String filename) throws FileNotFoundException, IOException {
			// bruge scanner
			String line = "";
			String destFilename = "Data/index.html";
			File fh = new File(filename);
			Scanner myScanner = new Scanner(fh);
			while(myScanner.hasNextLine()) {
				line = myScanner.nextLine();
				System.out.println(line);
				FileExporter.makeHTML(line, destFilename);
			}
		}
	}
	
}
