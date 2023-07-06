package proj3;
import java.util.Scanner;
public class whileloopp {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int number = input.nextInt();

		        int sum = 0;
		        
		        while (number >= 0) {
		            System.out.println("Please enter a positive number: ");
		            number = input.nextInt();
		            
		            sum+= number;
		        }

		        System.out.println("sum is " + sum);
		    }
		

	}


