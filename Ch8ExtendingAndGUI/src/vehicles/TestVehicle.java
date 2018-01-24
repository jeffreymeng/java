/*
 * Programmer: Jeffrey Meng
 * Date: Jan 22, 2018
 * Purpose:
 */

package vehicles;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle("Acura", 2005, 7, 4);

		vehicle.displayInfo();
		vehicle.setManufacturer("Honda");
		vehicle.setYear(2018);
		vehicle.setDoors(2);
		vehicle.setPassengers(4);
		vehicle.displayInfo();

		Truck truck = new Truck("Acura", 2005, 7, 4, 2000, 100000, 6, 90000);
		truck.DisplayInfo();
		truck.setManufacturer("Honda");

		truck.setYear(2014);

		truck.setDoors(2);

		truck.setPassengers(2);

		truck.setTowingWeight(10000);

		truck.setCargoArea(90000);

		truck.setWheels(4);

		truck.setOrigionalPrice(85000);

		truck.displayInfo();
	}

}
