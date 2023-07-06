package proj3;
import java.util.Scanner;
public class service {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the petrol");
		        int petrol = input.nextInt();

		        System.out.print("Enter the engine temperature");
		        int enginetemperature = input.nextInt();

		        System.out.print("Enter the tire pressure");
		        int tirePressure = input.nextInt();

		        if (petrol >= 1 && petrol <= 3 && enginetemperature <= 25 && tirePressure == 10) {
		            System.out.println("Car started successfully");
		        } else {
		            System.out.println("Car cannot be started");
		        }

		        
		}
		
	}


