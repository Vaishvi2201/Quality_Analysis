package com.inheritance.abstraction.programs;

public class Vehicle {

	String vehicleType;
	int noOfWheels;

	Vehicle(String vt, int nw) {
		vehicleType = vt;
		noOfWheels = nw;
	}

	public void vehicleDetails(String vehicleType, int noOfWheels) {
		System.out.println("the vehicle type=" + vehicleType);
		System.out.println("the number of wheels are=" + noOfWheels);
	}

	public float price(float showroomPrice, float roadTax, float insurance) {
		return showroomPrice + roadTax + insurance;
	}
}
