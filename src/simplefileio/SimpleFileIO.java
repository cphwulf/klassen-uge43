package simplefileio;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class SimpleFileIO {
	
	static String filename;
	static String filenameOut;
	static String filenameIn;
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO code application logic here
		filename = "Data/test3.csv";
		filenameOut = "Data/index.html";
		filename = "Data/test2.csv";
		filename = "Data/cars.csv";
		//MyFileIO.readFromFile(filename);
		String testString = "S80 34 2.5T 4dr";
		//int retValDoors = StringParsing.getNumOfDoors(testString);
		//int retValDoors = 5;
		//System.out.println(retValDoors);
		//MyFileIOBuff.readFromFile(filename);
		//MyFileIOBuff.readFromFileChunks(filename);
		MyFileIOBuff.readFromFileinBuffer(filename);
		//MyFileOut.writeFile(testString, filename);
		
	}
	
	static class StringParsing {
		public static void parseCarToHTML(String carString) throws IOException {
			String filenameOut = "Data/index.html";
			String retVal = "";
			// 3;Acura;TSX 4dr;4;200;22;29;3230;105;1999;239831;
			String[] myLineArr = carString.split(";");
			retVal += "<h2>" + myLineArr[1] + "</h2>\n";
			retVal += "<ul>\n";
			for (int i=2; i< myLineArr.length;i++) {
				retVal += "<li>" + myLineArr[i] + "</li>\n";
			}
			retVal += "</ul>\n";
			MyFileOut.writeFileHTML(retVal, filenameOut);
		}
		
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
	
	static class MyFileOut {
		public static void writeFile(String str, String filename) throws IOException {
			File fh = new File(filename);
			FileWriter fw = new FileWriter(fh);
			fw.write("her bor kurt\n");
			fw.write("her bor anton\n");
			fw.close();
		}
		
		
		public static void writeFileHTML(String str, String filename) throws IOException {
			File fh = new File(filename);
			FileWriter fw = new FileWriter(fh,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String tmpString = "<html><body>\n";
			tmpString += str;
			tmpString += "</body></html>\n";
			bw.write(tmpString);
			bw.newLine();
			bw.close();
		}
	}
	
	static class MyFileIO {
		
		public static void readFromFile(String filename) throws FileNotFoundException {
			File file = new File(filename);
			Scanner myScanner = new Scanner(file);
			String line = "";
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
			String filenameOut = "Data/index.html";
			String line;
			line = br.readLine();
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				//MyFileOut.writeFileHTML(line, filenameOut);
				StringParsing.parseCarToHTML(line);
			}
			br.close();
		}
	}
}

