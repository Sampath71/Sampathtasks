package proj2;

import java.util.Scanner;

public class may26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int deepak = 5000;
		System.out.println("enter the cost");
		int cost_shirt = input.nextInt();
		int cost_pen = input.nextInt();
		int cost_choc = input.nextInt();
		int total = cost_shirt + cost_pen + cost_choc;

		System.out.println("the total cost is" + total);

		int balance = 5000 - total;
		if (balance >= 2000) {
			System.out.println("purchase more");
		}		else if (balance >= 1000 && balance<2000) {
					System.out.println("quadbury");
			}	else if (balance >= 2000) {
					System.out.println("Bangles");
			}	else if (balance == 500) {
					System.out.println("auto");

	}
	}
}
