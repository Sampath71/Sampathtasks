package proj2;
import java.util.Scanner;
public class code10 {

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
		
		if(per <=100){
			if(per >=90)
				System.out.println("grade A");
			else if(per >=80) {
				System.out.println("grade B");
			}
			else if(per >=70) {
				System.out.println("grade c");
			}
			else if(per >=60) {
				System.out.println("grade d");
			}
			else if(per >=50) {
				System.out.println("grade e");
			}
			else {
				System.out.println("Resultinvalid , enter valid grade till 100");
			}
		}

	}

}
