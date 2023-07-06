package hybrid;

public class car {
	
		void run() {
			System.out.println("vehicle is by company");
			
		}
}
		class vehicle extends car{
			void run() {
				System.out.println("car is docomo");
			}
			
		

	public static void main(String[] args) {
		car c = new car();
		vehicle v = new vehicle(); 

		c.run();
		v.run();


	}

		}

