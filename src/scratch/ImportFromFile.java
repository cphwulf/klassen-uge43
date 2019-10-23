/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package scratch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author thor
 */
public class ImportFromFile {
	public static boolean importDogNames (String filename) throws MyException {
		boolean retVal = false;
		//BELLA,110
		//BUDDY,83
		String line = "";
		FileReader fr = null;
		File file = new File(filename);
		try {
			fr = new FileReader(file);
		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
		try {
			BufferedReader bw = new BufferedReader(fr);
			while((line = bw.readLine()) != null) {
				System.out.println("Line: " + line);
				String[] myArr = line.split(",");
				int rarity = Integer.parseInt(myArr[1]);
				if (rarity < 5) {
					throw new MyException("fejl");
				}
			}
			
		} catch (Exception e) {
			System.out.println("EDrrror: " + e.toString());
		}
		
		return retVal;
		
	}
	
}
