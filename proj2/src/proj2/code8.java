package proj2;
import java.util.Scanner;
public class code8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter cp and sp");
		int cp = input.nextInt();
		int sp = input.nextInt();
		System.out.println("enter np");
		float np = input.nextFloat(); 
		if(cp<np) {
			System.out.println("profit");
			
		}
		else {
			System.out.println("loss");
		}

	}

}
