package proj2;
import java.util.Scanner;
public class code11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the character");
		char ch = input.next().charAt(0);
		if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("This is a  Alphabet");
		}
		else {
			System.out.println("This is not a Alphabet");
		}

	}

}
