package com.inheritance.abstraction.programs;

public interface Mutant {
	public static void mutantDetails(String mutantName, String mutantAbility, String mutantPlanet) {
		System.out.println("The name of mutant is =" + mutantName);
		System.out.println("The ability of mutant is =" + mutantAbility);
		System.out.println("The name of mutant planet is =" + mutantPlanet);
	}

	abstract void personality();
}