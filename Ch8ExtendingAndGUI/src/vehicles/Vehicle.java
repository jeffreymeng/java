/*
 * Programmer: Jeffrey Meng
 * Date: Jan 22, 2018
 * Purpose:
 */

package vehicles;

import Utils.Confirmation;

public class Vehicle {
	protected String manufacturer;
	protected int year;
	protected int doors;
	protected int passengers;

	public Vehicle() {
		this.manufacturer = "[DEFUALT]";
		this.year = 2018;// this.year =
							// Calendar.getInstance().get(Calendar.YEAR);
		this.doors = 4;
		this.passengers = 5;

	}

	public Vehicle(String manufacturer, int year, int doors, int passengers) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.doors = doors;
		this.passengers = passengers;

	}

	public String getManufacturer() {
		
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		//TODO: return Confirmation class to confirm set.
		this.manufacturer = manufacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	
	
	
}
