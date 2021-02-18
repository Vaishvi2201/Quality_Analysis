package com.inheritance.abstraction.programs;

import java.util.Scanner;

/**
 * To perform multilevel inheritance Vehicle is the parent class with
 * vehicleDetails and price method Car is the subclass of Vehicle with
 * overridden vehicleDetails and price methods. other methods are startEngine
 * and stopEngine Toyota is the subclass of Car with vehicledetails, drive brake
 * methods. created on-17-Feb 2021
 * @author vaishvi patel
 *
 */

class CarExecution {
	public static float newCarSpeed;

	public static void main(String[] args) {
		CarExecution ce = new CarExecution();

		Toyota ty = new Toyota(null, null, 0, null, null);
		String stopCarAnswer;

		String engineType = ce.engineTypeInput();

		String fuelType = ce.fuelTypeInput();

		String carColor = ce.colorInput();

		System.out.println("Here are your car details \n\n");
		ty.vehicleDetails("Toyota", engineType, 6, fuelType, carColor);

		String priceInput = ce.validPriceInput();

		if (priceInput.equalsIgnoreCase("y")) {

			float showroomPrice, roadTax, insurance;
			showroomPrice = ce.validShowroomPrice();
			roadTax = ce.validRoadTax();
			insurance = ce.validInsurance();
			float totalPrice = ty.price(showroomPrice, roadTax, insurance);
			System.out.println("The total price of car=" + totalPrice);
		}

		String drivingInput = ce.validDrivingInput();

		if (drivingInput.equalsIgnoreCase("Y")) {
			ty.startEngine();

			System.out.println("Enter the speed at which you want to drive=");
			Scanner sc4 = new Scanner(System.in);
			float carSpeed = sc4.nextFloat();

			do {
				System.out.println("Do you want to accelarate(A) or brake(B)?? A/B");
				Scanner sc5 = new Scanner(System.in);
				String accelarateOrBrake = sc5.nextLine();

				if (accelarateOrBrake.equalsIgnoreCase("A")) {

					int carGear = ce.gearInput();

					newCarSpeed = ty.currentSpeed(carGear, carSpeed);

					carSpeed = newCarSpeed;
				}

				else if (accelarateOrBrake.equalsIgnoreCase("B")) {
					String breakType = ce.brakeTypeInput();

					newCarSpeed = ty.brake(breakType, carSpeed);
					carSpeed = newCarSpeed;

				} else {
					System.out.println("The input to accelarate or brake is invalid");
				}

				System.out.println("Do you want to stop the car? Y/N");
				Scanner sc9 = new Scanner(System.in);
				stopCarAnswer = sc9.nextLine();

			} while (stopCarAnswer.equalsIgnoreCase("N"));
			ty.stopEngine();

		} else {
			System.out.println("You just viewed the car details!! Thank you!!");
		}

	}

	public String engineTypeInput() {
		String engineType;
		do {
			System.out.println("Enter the type of engine in toyota car Inline-four or V/6=");
			Scanner sc = new Scanner(System.in);
			engineType = sc.nextLine();

			if (engineType.equalsIgnoreCase("Inline-four") || engineType.equalsIgnoreCase("V/6")) {
				break;
			} else {
				System.out.println("Your engine type value is not valid Please Enter inline-four or V/6!!");
			}
		} while (true);

		return engineType;
	}

	public String fuelTypeInput() {
		String fuelType;
		do {
			System.out.println("Enter the type of fuel in your toyota car Petrol/Diesel=");
			Scanner sc1 = new Scanner(System.in);
			fuelType = sc1.nextLine();

			if (fuelType.equalsIgnoreCase("Petrol") || fuelType.equalsIgnoreCase("Diesel")) {
				break;
			} else {
				System.out.println("Your fuel type value is not valid Please Enter Petrol/Diesel!!");
			}
		} while (true);

		return fuelType;
	}

	public String colorInput() {
		String carColor;
		do {
			System.out.println("Enter the color of your car Black/White/Silver/Red=");
			Scanner sc2 = new Scanner(System.in);
			carColor = sc2.nextLine();

			if (carColor.equalsIgnoreCase("black") || carColor.equalsIgnoreCase("white")
					|| carColor.equalsIgnoreCase("red") || carColor.equalsIgnoreCase("silver")) {
				break;
			} else {
				System.out.println("Your engine type value is not valid Please Enter Black/White/Silver/Red!!");
			}
		} while (true);

		return carColor;
	}

	public String validDrivingInput() {
		String drivingInput;
		do {
			System.out.println("\n\nDo you want to start driving Y/N");
			Scanner sc3 = new Scanner(System.in);
			drivingInput = sc3.nextLine();

			if (drivingInput.equalsIgnoreCase("y") || drivingInput.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("Your driving input value is not valid Please Enter Y/N!!");
			}
		} while (true);

		return drivingInput;
	}

	public String brakeTypeInput() {
		String breakType;
		do {
			System.out.println("Which type of brake you want to apply low/medium/hard");
			Scanner sc8 = new Scanner(System.in);
			breakType = sc8.nextLine();

			if (breakType.equalsIgnoreCase("low") || breakType.equalsIgnoreCase("medium")
					|| breakType.equalsIgnoreCase("hard")) {
				break;
			} else {
				System.out.println("Your break type is invalid please enter low/medium/hard");
			}
		} while (true);

		return breakType;
	}

	public int gearInput() {
		int carGear;
		do {
			System.out.println("Enter the gear in which you want to drive=");
			Scanner sc6 = new Scanner(System.in);
			carGear = sc6.nextInt();

			if (carGear == 1 || carGear == 2 || carGear == 3 || carGear == 4 || carGear == 5) {
				break;
			} else {
				System.out.println("Your break type is invalid please enter 1/2/3/4/5");
			}
		} while (true);

		return carGear;
	}

	public String validPriceInput() {
		String priceInput;
		do {
			System.out.println("Do you want to know the price of your car?? Y/N");
			Scanner sc = new Scanner(System.in);
			priceInput = sc.nextLine();

			if (priceInput.equalsIgnoreCase("y") || priceInput.equalsIgnoreCase("n")) {
				break;
			} else {
				System.out.println("Please Choose Y/N!!");
			}
		} while (true);

		return priceInput;
	}

	public float validShowroomPrice() {
		float showroomPrice;
		do {
			System.out.println("Enter your car showroom price");
			Scanner sc3 = new Scanner(System.in);
			showroomPrice = sc3.nextFloat();

			if (showroomPrice == (float) showroomPrice) {
				break;
			} else {
				System.out.println("Please Enter valid showroom price!!!");
			}
		} while (true);

		return (float) showroomPrice;
	}

	public float validRoadTax() {
		float roadTaxPrice;
		do {
			System.out.println("Enter your car road tax price");
			Scanner sc3 = new Scanner(System.in);
			
			roadTaxPrice = sc3.nextFloat();

			if (roadTaxPrice == (float) roadTaxPrice) {
				break;
			} else {
				System.out.println("Please Enter valid road tax price!!!");
			}
		} while (true);

		return (float) roadTaxPrice;
	}

	public float validInsurance() {
		float insurancePrice;
		do {
			System.out.println("Enter your car insurance price");
			Scanner sc3 = new Scanner(System.in);
			insurancePrice = sc3.nextFloat();

			if (insurancePrice == (float) insurancePrice) {
				break;
			} else {
				System.out.println("Please Enter valid insurance price!!!");
			}
		} while (true);

		return (float) insurancePrice;
	}

}
