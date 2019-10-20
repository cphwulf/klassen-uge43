package simplefileio;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SimpleFileIO {
	
	static String filename;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO code application logic here
		filename = "Data/test.csv";
		filename = "Data/test5.csv";
		//filename = "Data/test2.csv";
		//MyFileIO.readFromFile(filename);
		String testString = "S80 34 2.5T 4dr";
		//int retValDoors = StringParsing.getNumOfDoors(testString);
		//int retValDoors = 5;
		//System.out.println(retValDoors);
		//MyFileIOBuff.readFromFile(filename);
		//MyFileIOBuff.readFromFileChunks(filename);
		MyFileIOBuff.readFromFileinBuffer(filename);
		
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
	static class MyFileIOBuff {
		public static void readFromFile(String filename) throws FileNotFoundException, IOException {
			//2;Acura;RSX Type S 2dr;4;200;24;31;2778;101;1998;12000
			//FileReader myRead = new FileReader(filename);
			FileReader myRead = new FileReader(filename);
			int counter = 0;
			int retVal = 0;
			char retValC;
			while ( myRead.read() != -1) {
				counter++;
				retVal = myRead.read();
				retValC = (char) retVal;
				System.out.print(retValC + " " + counter + " ");
				System.out.println(retVal);
				
			}
		}
		public static void readFromFileChunks(String filename) throws FileNotFoundException, IOException {
			//2;Acura;RSX Type S 2dr;4;200;24;31;2778;101;1998;12000
			//FileReader myRead = new FileReader(filename);
			FileReader myRead = new FileReader(filename);
			int counter = 0;
			int retVal = 0;
			char[] retValCArr = new char[1024];
			int charsRead = myRead.read(retValCArr, 0, 1024);
			System.out.println(Arrays.toString(retValCArr));
		}

		public static void readFromFileinBuffer(String filename) throws FileNotFoundException, IOException {
			//2;Acura;RSX Type S 2dr;4;200;24;31;2778;101;1998;12000
			//FileReader myRead = new FileReader(filename);
			FileReader myRead = new FileReader(filename);
			BufferedReader br = new BufferedReader(myRead);
			String line;
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		}
	}
}

