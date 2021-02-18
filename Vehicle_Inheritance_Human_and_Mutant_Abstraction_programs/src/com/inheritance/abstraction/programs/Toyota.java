package com.inheritance.abstraction.programs;

public class Toyota extends Car {
	Toyota(String bn, String et, int pc, String ft, String c) {
		super(bn, et, pc, ft, c);
	}

	public void vehicleDetails() {

		super.vehicleDetails(brandName, engineType, personCapacity, fuelType, color);

	}

	public float currentSpeed(int gear, float speed) {
		if (gear == 1) {
			System.out.println("The car speed is increased to=" + (speed += 10));
		} else if (gear == 2) {
			System.out.println("The car speed is increased to=" + (speed += 20));
		} else if (gear == 3 || gear == 4 || gear == 5) {
			System.out.println("The car speed is increased to=" + (speed += 30));
		} else {
			System.out.println("this gear is invalid");
		}

		return speed;
	}

	public float brake(String brakeType, float speed) {

		if (brakeType.equalsIgnoreCase("hard")) {
			System.out.println("Your Speed is reduced to=" + (speed -= 30));
		} else if (brakeType.equalsIgnoreCase("medium")) {
			System.out.println("Your Speed is reduced to=" + (speed -= 20));
		} else if (brakeType.equalsIgnoreCase("low")) {
			System.out.println("Your Speed is reduced to=" + (speed -= 10));
		} else {
			System.out.println("this brake type is invalid");
		}
		return speed;
	}
}
