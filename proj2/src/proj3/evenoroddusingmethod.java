package proj3;

public class evenoroddusingmethod {
	public static void EvenOdd(int num) {
	        if (num % 2 == 0) {
	            System.out.println(num + " is even.");
	        } else {
	            System.out.println(num + " is odd.");
	        }
	    }
	    
	    public static void main(String[] args) {
	        int num1 = 99;
	        int num2 = 70;
	        int num3 = 66;
	        int num4 = 8;
	        
	        EvenOdd(num1);
	        EvenOdd(num2);
	        EvenOdd(num3);
	        EvenOdd(num4);
	    }
	}



