package hybrid;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = input.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.println("*");
			}
			System.out.println("\n");
		}

	}

}
