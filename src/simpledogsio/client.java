package simpledogsio;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class client {
	public static void main(String[] args) throws FileNotFoundException {
		String filename = "Data/test2.csv";
		//ImportDogsFromFile.importDogsFromCSV(filename);
		ImportDogsFromFile.importDogsFromCSV(filename);
	}
	
}

