package hybrid;

public class item {
		public void emp(String name,String title,double sal) {
			System.out.println("Name "+ name  + "Title " + title + "Salary " + sal);
		}
		
		public void emp(String title,double sal,String name) {
			System.out.println("Title " + title + "salary " + sal+ "Name "+ name);
		}

		public static void main(String[] args) {
	 item obj = new item();
	 obj.emp("ali","teamLeader",1000);
	 obj.emp("manager",20000,"sunil");

		}


		
	}


