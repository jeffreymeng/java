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
		vehicle.setManufacturer("Honda");
		System.out.println(vehicle.getManufacturer());

		System.out.println(vehicle.getYear());
		vehicle.setYear(2018);
		System.out.println(vehicle.getYear());

		System.out.println(vehicle.getDoors());
		vehicle.setDoors(2);
		System.out.println(vehicle.getDoors());

		System.out.println(vehicle.getPassengers());
		vehicle.setPassengers(4);
		System.out.println(vehicle.getPassengers());

		Truck truck = new Truck("Acura", 2005, 7, 4, 2000, 100000, 6, 90000);

		System.out.println(truck.getManufacturer());
		truck.setManufacturer("Honda");
		System.out.println(truck.getManufacturer());

		System.out.println(truck.getYear());
		truck.setYear(2014);
		System.out.println(truck.getYear());

		System.out.println(truck.getDoors());
		truck.setDoors(2);
		System.out.println(truck.getDoors());

		System.out.println(truck.getPassengers());
		truck.setPassengers(2);
		System.out.println(truck.getPassengers());

		System.out.println(truck.getTowingWeight());
		truck.setTowingWeight(10000);
		System.out.println(truck.getTowingWeight());

		System.out.println(truck.getCargoArea());
		truck.setCargoArea(90000);
		System.out.println(truck.getCargoArea());

		System.out.println(truck.getWheels());
		truck.setWheels(4);
		System.out.println(truck.getWheels());

		System.out.println(truck.getOrigionalPrice());
		truck.setOrigionalPrice(85000);
		System.out.println(truck.getOrigionalPrice());

	}

}
