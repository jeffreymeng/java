/*
 * Programmer: Jeffrey Meng
 * Date: Jan 22, 2018
 * Purpose:
 */

package vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Acura", 2005, 7, 4);
		
		System.out.println(vehicle.getManufacturer());
		vehicle.setManufacturer("Acura");
		System.out.println(vehicle.getManufacturer());
		
		System.out.println(vehicle.getYear());
		vehicle.setYear(2018);
		System.out.println(vehicle.getYear());
		
		System.out.println(vehicle.getDoors());
		vehicle.setDoors(2);
		System.out.println(vehicle.getDoors());
		
		System.out.println(vehicle.getPassengers());
		vehicle.setPassengers(2);
		System.out.println(vehicle.getPassengers());

	}

}