package proj3;

public class voting {
	    
	    public static void checkEligibility(int age) {
	        if (age >= 18) {
	            System.out.println("You are eli gible to vote.");
	        } else {
	            System.out.println("You are not eligible to vote.");
	        }
	    }
	    
	    public static void main(String[] args) {
	    	int age =12;
	        
	        checkEligibility(age);
	    }
	}



