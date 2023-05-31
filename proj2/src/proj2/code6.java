package proj2;
import java.util.Scanner;
public class code6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the 5 subjects");
		int s1 = input.nextInt();
		int s2 = input.nextInt();
		int s3 = input.nextInt();
		int s4 = input.nextInt();
		int s5 = input.nextInt();
		
		int tot = s1+s2+s3+s4+s5;
		
		float per = tot / 5;
		
		System.out.println("total marks is"+" "+tot);
		System.out.println("total % is"+" "+per);

	}

}
