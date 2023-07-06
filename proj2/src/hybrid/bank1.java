package hybrid;


public abstract class bank1 {
	abstract int getRateOfInterest();
}
class Sbi extends bank1{
     int getRateOfInterest(){ 
    	return 7; 
    	}
}
class PNB extends bank1{
    int getRateOfInterest(){ 
   	return 5; 
   	}
}

class screen{
	public static void main(String[] args) {
		bank1 b;
		b = new Sbi();
		System.out.println("rate of interest is " +b.getRateOfInterest()+"%");
		b=new PNB();
		System.out.println("rate of interest is " +b.getRateOfInterest()+"%");

	}
}
