package proj3;
import java.util.Scanner;
public class smarthouse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the option");
		int actions = input.nextInt();
		boolean deviceon = true;
		while(deviceon == true) {
		System.out.println("enter your choice");
		int choice = input.nextInt();
		//System.out.println("enter your choice");
		
		
			switch(choice){
		case 1:
			System.out.println("switch the light");
			break;
		case 2:
			System.out.println("play the music");
			break;
		case 3:
			System.out.println("say any joke");
			break;
		case 4:
			System.out.println("off the power");
			break;
		case 5:
			System.out.println("whats up");
			break;
			
		}
		}
	
		System.out.println("invalid");
		
	
	}

}


