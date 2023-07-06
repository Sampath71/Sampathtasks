package proj3;

class Specalist extends Doctor {

	private static final String RegNo = null;
	private static final String Hospital = null;
	private static final String Specialty = null;
	private static final String Unit = null;



	public Specalist(String regNo, String unit, String hospital) {
		super(regNo, unit, hospital);
		
	}



	
		
		  
		       
		    

		  
		   
		    public static void main(String[] args) {
		        
		        Doctor doctor = new Doctor("1234", "General", "ABC Hospital");

		      
		        
		        
		        System.out.println("Doctor Details");
		        System.out.println("Registration Number " + doctor.RegNo);
		        System.out.println("Unit " + doctor.Unit);
		        System.out.println("Hospital " +doctor. Hospital);

		        
		        
		        System.out.println("Registration Number " + Specalist.RegNo);
		        System.out.println("Unit " + Specalist.Unit);
		        System.out.println("Hospital " + Specalist.Hospital);
		        System.out.println("Specialty " + Specalist.Specialty);
		    }



	}


