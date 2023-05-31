package proj2;
import java.util.Scanner;
public class code9 {

	public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the cost price: ");
		        double costPrice = input.nextDouble();

		        System.out.print("Enter the GST (in decimal form): ");
		        double gst = input.nextDouble();

		        double sellingPrice = costPrice * (1 + gst);
		        double profit = costPrice - sellingPrice;

		        System.out.println("Selling Price: " + sellingPrice);
		        System.out.println("Profit: " + profit);
		    }
		


	}


