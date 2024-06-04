package com.andrea.javacourse;

import classes.Bike;
import classes.Car;
import classes.Motorcycle;
import classes.Vehicle;

public class Main {

	public static void main(String[] args) {

					// ESEMPI DI SFRUTTAMENTO EREDITARIETA'
		// Vehicle v = new Vehicle("BMW", "Nera", 4);
		// System.out.println(v.toString()); // Overridind del metodo toString

		Car c = new Car("Jeep", "Bianco", 4, 5);
		// System.out.println(c.toString());

		Bike b = new Bike("MyBike", "Rosso", 2, 85);
		// System.out.println(b.toString());

		Motorcycle m = new Motorcycle("Yamaha", "Rossa", 2, 120);
		// System.out.println(m.toString());

					// ESEMPIO DI UTILIZZO DEL POLIMORFISMO
		Vehicle[] myGarage = new Vehicle[3];
		// myGarage[0] = v;
		myGarage[0] = c; // Polimorfismo
		myGarage[1] = b; // Polimorfismo
		myGarage[2] = m; // Polimorfismo

		for(Vehicle singleVehicle : myGarage) {
			System.out.println(singleVehicle.toString());  // Override del metodo toString
			System.out.println(singleVehicle.computePrice());
		}
	}
}
