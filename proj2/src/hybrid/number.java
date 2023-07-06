package hybrid;

public class number {

	public static void main(String[] args) {
		
		
			try {
				try {
					int []a= {1,2,3};
					System.out.println(a[3]);
				}
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e+"array exception");
				
			}
				
					System.out.println(3/0);
			
			}
			catch(ArithmeticException e) {
				System.out.println("divide by 0 errors");
		}
		

		}
}
