
// Roll dice using Java Random utility

import java.util.Random;
import java.util.Scanner;

public class Lab6_2 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		int number;
		System.out.println("Welcome to the Grand Circus Casino! \n");
		System.out.print("How many sides should each die have? :");
		number = scnr.nextInt();
		System.out.println();

		int i = 1;
		String rollAgain = "y";

		do {
			System.out.println("Roll " + i + ":");
			System.out.println(generateRandomDieRoll(number) + 1);
			System.out.println(generateRandomDieRoll(number) + 1 + "\n");

			System.out.print("Roll again? (y/n):");
			rollAgain = scnr.next();

			if (rollAgain.equalsIgnoreCase("n")) {
				System.out.print("\nDone!");

			}
			System.out.println();
			i++;
		}

		while (rollAgain.equalsIgnoreCase("y"));
		scnr.close();

	}

	public static int generateRandomDieRoll(int number) {

		Random randGen = new Random();
		return randGen.nextInt(number) + 1;

	}
}
