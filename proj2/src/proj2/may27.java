package proj2;

import java.util.Scanner;

public class may27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter blood donor's name: ");

		String name = input.nextLine();

		System.out.println("Enter donor's age: ");

		int age = input.nextInt();
		System.out.println("Enter donor's weight: ");
		float weight = input.nextFloat();
		System.out.println("enter the disease");
		boolean disease = input.nextBoolean();
		if (age > 18 && weight > 50) {

			System.out.println("Allow to donate blood");

		} else if (age < 18) {

			System.out.println("Age is less. Cannot donate blood.");

		} else if (weight < 50) {
			System.out.println("Weight is less. Cannot donate blood.");
		} else if (disease) {
			System.out.println("doner has disease.cannot donate blood");

		}

	}
}