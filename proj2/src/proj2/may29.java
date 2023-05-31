package proj2;
import java.util.Scanner;
public class may29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter values of a b c ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		
		System.out.println("enter the choice");
		int choice = input.nextInt();
		
double x1 = 0;
		
		double x2=0;
		
		if (choice == 1) {
		x1 =  (b + Math.sqrt(b^-4*a*c)) / (2 * a);
		System.out.println(x1);
		}
		else{
			x2 =  (b - Math.sqrt(b^-4*a*c)) / (2 * a);
			System.out.println(x2);
	}
		
if(x1>0 || x2 >0) {
			
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}

	
	}

}
