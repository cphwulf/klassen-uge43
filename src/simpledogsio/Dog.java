/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledogsio;

/**
 *
 * @author thor
 */
public class Dog {
//20990,Red,Dobermann,AMY,Desexed Female,WATERLOO CORNER
	String name;
	String gender;
	String color;
	String race;
	String cityOrigin;

	public Dog(String name, String gender, String color, String race, String cityOrigin) {
		this.name = name;
		this.gender = gender;
		this.color = color;
		this.race = race;
		this.cityOrigin = cityOrigin;
	}

	public Dog() {

	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getColor() {
		return color;
	}

	public String getRace() {
		return race;
	}

	public String getCityOrigin() {
		return cityOrigin;
	}

	@Override
	public String toString() {
		String msg = "";
		msg += "NAME: " + this.name;
		msg += "RACE: " + this.race;
		msg += "GENDER: " + this.gender;
		msg += "COLOR: " + this.color;
		msg += "TOWN: " + this.cityOrigin;
		System.out.println(msg);

		return msg;
	}

	
	
}
