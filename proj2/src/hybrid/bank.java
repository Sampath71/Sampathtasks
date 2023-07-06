package hybrid;

public class bank {
	 float getRateOfInterest(){return 0;}
	}
	 
	class sbi extends bank{
	    float getRateOfInterest(){return 5;}
	}
	 
	class icic extends bank{
	    float getRateOfInterest(){return 6;}
	}
	 
	class axis extends bank{
	    float getRateOfInterest(){return 7;}
	}
	 
	
	class display{
	public static void main(String[] args) {
		sbi s = new sbi();
	    icic i = new icic();
	    axis a = new axis();
	    System.out.println("Rate of Interest in SBI is "+s.getRateOfInterest());
	    System.out.println("Rate of Interest in icic is "+i.getRateOfInterest());
	    System.out.println("Rate of Interest in axis is "+a.getRateOfInterest());
		

	}

}
