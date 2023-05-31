package proj2;

import java.util.Scanner;

public class code12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the currency");
		int amo = input.nextInt();
		int n500, n100, n50, n20, n10, n5;
		n500 = n100 = n50 = n20 = n10 = n5 = 0;
		if (amo >= 500) {
			n50 = amo / 500;
			amo -= n500 * 500;
		
		if (amo >= 100) {
			n100 = amo / 100;
			amo -= n100 * 100;
		}
		if (amo >= 50) {
			n50 = amo / 50;
			amo -= n50 * 50;
		}
		if (amo >= 20) {
			n20 = amo / 20;
			amo -= n20 * 20;
		}
		if (amo >= 10) {
			n10 = amo / 10;
			amo -= n10 * 10;
		}
		if (amo >= 5) {
			n5 = amo / 10;
			amo -= n5 * 5;
		}
		}

		System.out.println("Total Number of Notes");
		System.out.println("500 = " + n500);
		System.out.println("100 = " + n100);
		System.out.println("50 = " + n50);
		System.out.println("20 = " + n20);
		System.out.println("10 = " + n10);
		System.out.println("5 = " + n5);

	}

}
