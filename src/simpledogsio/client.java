package simpledogsio;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thor
 */
public class client {
	public static void main(String[] args) {
		DogCompound myCompound = new DogCompound("C10", "Kurt");
		String filename = "Data/test2.csv";
		ImportDogsFromFile.importDogsFromCSV(filename,  myCompound);
		Dog myDog = new  Dog();
		ArrayList<Dog> myDogs = myCompound.getDog("AMYRACE");
		for (Dog dog: myDogs) {
			System.out.println("AMY: " + dog);
		}
		
	}
	
}

