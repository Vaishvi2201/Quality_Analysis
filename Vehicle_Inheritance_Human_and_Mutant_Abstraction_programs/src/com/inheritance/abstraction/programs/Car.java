package com.inheritance.abstraction.programs;

public class Car extends Vehicle {
	String brandName;
	String engineType;
	int personCapacity;
	String fuelType;
	String color;

	Car(String bn, String et, int pc, String ft, String c) {
		super("Car", 4);
		brandName = bn;
		engineType = et;
		personCapacity = pc;
		fuelType = ft;
		color = c;

	}

	public void vehicleDetails(String brandName, String engineType, int personCapacity, String fuelType, String color) {

		System.out.println("the vehicle type=" + super.vehicleType);
		System.out.println("the number of wheels are=" + super.noOfWheels);
		System.out.println("The brand name is=" + brandName);
		System.out.println("The engine type is=" + engineType);
		System.out.println("The no of person capacity is=" + personCapacity);
		System.out.println("The fuel type is=" + fuelType);
		System.out.println("The color is=" + color);
	}

	public float price() {
		return super.price(700000, 1500, 1000);
	}

	public void startEngine() {
		System.out.println("Start the car engine");
	}

	public void stopEngine() {
		System.out.println("Stop the car engine");
	}

}
