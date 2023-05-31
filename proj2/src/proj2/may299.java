package proj2;
import java.util.Scanner;
public class may299 {

	public static void main(String[] args) {

		        Scanner input = new Scanner(System.in);

		        System.out.print("Enter the basic salary ");
		        int basicsalary = input.nextInt();
		        double hra;
				double da;

		        if (basicsalary <= 10000) {
		            hra = 0.2 * basicsalary;
		            da = 0.8 * basicsalary;
		        } else if (basicsalary <= 20000) {
		            hra = 0.25 * basicsalary;
		            da = 0.9 * basicsalary;
		        } else {
		            hra = 0.3 * basicsalary;
		            da = 0.95 * basicsalary;
		        }

		        double grossSalary = basicsalary + hra + da;
		        System.out.println("Gross Salary: " + grossSalary);

		        
		    
}

}
	


