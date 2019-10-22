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
	public static void main(String[] args) {
		String filename = "Data/test2.csv";
		ImportDogsFromFile.importDogsFromCSV(filename);
	}
	
}

