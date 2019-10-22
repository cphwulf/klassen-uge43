/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledogsio;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class DogCompound {
	String id;
	String name;
	ArrayList<Dog> compoundDogs;

	public DogCompound(String id, String name) {
		this.id = id;
		this.name = name;
		this.compoundDogs = new ArrayList<>();
	}
	public DogCompound() 
	{

	}

	public void addDog(Dog dog) {
		compoundDogs.add(dog);
	}

	public DogCompound getCompoundFromId(String idString) {
		DogCompound tmpCompound = null;
		if (this.id == idString) {
			return this;
		} else {
			return tmpCompound;
		}
	}

	public void showDogs() {
		for(Dog dog : compoundDogs) {
			System.out.println(dog);
		}
	}
	public ArrayList<Dog> getDog(String name) {
		ArrayList<Dog> retValDogs = new ArrayList<>();
		for (Dog dog : compoundDogs) {
			if (dog.getName().contains(name)) {
				retValDogs.add(dog);
			}
		}
		return retValDogs;

	}
	
}
