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
		//MyFileIO.readFromFile(filename);
		String testString = "S80 34 2.5T 4dr";
		int retValDoors = StringParsing.getNumOfDoors(testString);
		//int retValDoors = 5;
		System.out.println(retValDoors);
	}
	
	static class StringParsing {
		
		public static int getNumOfDoors(String myString) {
			int retVal = 0;
			/*
			find tallet umiddelbart før dr - hvis dr forekommer
			S80 2.5T 4dr
			Focus ZX5 5dr
			IS 300 4dr manual
			Forester X
			*/
			if (myString.contains("dr")) {
				String[] myLineArr = myString.split(" ");
				for (int i=0; i< myLineArr.length;i++) {
					if (myLineArr[i].contains("dr")) {
						String tmpStr = myLineArr[i];
						System.out.println("into action" + tmpStr);
						char[] myChars = tmpStr.toCharArray();
						for (int j=0;j<myChars.length;j++ ) {
							if (myChars[j] < 57) {
								retVal=myChars[j]-48;
							}
						}
					}
					
				}
				
			}
			return retVal;
			
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
