package proj2;
import java.util.Scanner;
public class may277 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter marks");
		int college_year = input.nextInt();
		
		int year = input.nextInt();
		int per = input.nextInt();
		
		if(year == 1) {
			System.out.println("Subjects are math,sci");
		}else if(year == 2) {
			System.out.println("Subjects are ec,fc");
		}else if(year == 3) {
			System.out.println("Subjects are ac,gc");
		}else if(year == 4) {
			System.out.println("Subjects are bc,uc");
		}
		else {
			System.out.println("invalid");
		}if (per<=80 && per>=70) {
			System.out.println("first grade");
		}else if(per<=60 && per>=50) {
			System.out.println("second grade"); 
		}else if(per<=40 && per>=30) {
				System.out.println("first division");
	}

}
}