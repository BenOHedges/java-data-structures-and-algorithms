package org.example;

public class Recursion {
	public static void main(String[] args) {
//		walk(5);
//		System.out.println(factorial(7));
		System.out.println(power(2,8));
	}

	private static int power(int base, int exponent) {
		if(exponent <1) return 1; // base case
		return base * power(base, exponent-1); //recursive case
	}

	private static int factorial(int num) {
		if(num <1) return 1; //base case
		return num * factorial(num-1); //recursive case
	}

	private static void walk(int steps) {
		//iteration version
//		for (int i = 0; i < steps; i++) {
//			System.out.println("You take a step");
//		}
		//Recursion
		if(steps <1) return; //base case
		System.out.println("you take a step");
		walk(steps-1); //recursive case
	}
}
