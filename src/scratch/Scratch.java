/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

/**
 *
 * @author thor
 */
public class Scratch {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws MyException {
		// TODO code application logic here
		String filename = "Data/testNames.csv";
		filename = "Data/Dog_Names.csv";
		ImportFromFile.importDogNames(filename);
	}
	
}
