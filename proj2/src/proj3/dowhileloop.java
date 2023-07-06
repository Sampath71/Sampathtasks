package proj3;
import java.util.Scanner;
public class dowhileloop {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	        int number;
	        boolean isPrime;

	        do {
	            System.out.print("Enter a positive integer (or 0 to exit): ");
	            number = input.nextInt();

	            if (number <= 1) {
	                System.out.println("Number should be greater than 1.");
	                continue;
	            }

	            isPrime = true;

	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                	isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime)
	                System.out.println(number + " is a prime number.");
	            else
	                System.out.println(number + " is not a prime number.");

	        } while (number != 0);

	        System.out.println("Exiting the program.");
	                
		}
	
	}
	
