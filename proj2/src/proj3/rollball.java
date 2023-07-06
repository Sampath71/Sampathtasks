package proj3;
import java.util.Scanner;
public class rollball {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        int balance = 200;
		        int turn_amount;

		        do {
		            System.out.println("Enter the amount");
		            turn_amount = input.nextInt();

		            if (turn_amount >= 20) {
		                balance -= turn_amount;
		                System.out.println("Throw the ball");
		            } else {
		                System.out.println("Game over");
		                break;
		            }
		        } while (balance >= 20);
		    }
		}
