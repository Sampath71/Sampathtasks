package proj3;
import java.util.Scanner;
public class reversewhileloop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int reverse = 0;
		System.out.println("enter the number");
		number = input.nextInt();
		int temp = number;
		int remainder = 0;
        while(temp>0)
        {
	    remainder = temp % 10;
	    reverse = reverse * 10 + remainder;
            temp /= 10;


	}
        System.out.println("Reverse of " + number + " is " + reverse);

}
}
