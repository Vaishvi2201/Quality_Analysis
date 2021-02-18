package com.inheritance.abstraction.programs;

/**
 * Aim: to perform multiple inheritance and access the static method of
 * interface and also override the abstract methods 
 * created on:17 feb 2021
 * @author Vaishvi Patel
 *
 */
public class Implementation implements Human, Mutant {

	public static void main(String[] args) {
		Implementation impl = new Implementation();

		Mutant.mutantDetails("Vaishvi", "Fly", "Mars");
		impl.personality();

	}

	@Override
	public void personality() {
		System.out.println("This mutant can fly");

	}

	@Override
	public void humanDetails(String humanName, String humanSkills) {
		System.out.println("the name of human is =" + humanName);
		System.out.println("the skills of human are =" + humanSkills);

	}

}
