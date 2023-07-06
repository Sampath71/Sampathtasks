package proj3;
public class sumofdigits{
	
public int Add(int a, int b) {
	int sum = a + b;
	return sum;
}

public static void main(String[] args) {
	
	int n1 = 2;
	int n2 = 5;
	sumofdigits obj =new sumofdigits();
	int addition = obj.Add(n1, n2);
	System.out.println("the sum is "+addition);

}

}

