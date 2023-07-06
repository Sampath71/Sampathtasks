package hybrid;

public class c {
	public int even(int x) {
		if (x%2==0) {
			System.out.println("it is even");
		}
		else {
			System.out.println("it is odd");
		}
		return (x);
	}

	public static void main(String[] args) {
		c c =new c();
		System.out.println(c.even(6));

	}

}
