package hybrid;
abstract class car1 {
	public void car1(){
		System.out.println("car1 is created");
	}
	abstract void run();
	void ChangeGear() {
		System.out.println("Gear is changed");
	}
}
class maruthi extends car1{
		void run() {System.out.println("running safely");
	}
	public class Testabstraction2{
		public static void main(String[] args) {
			car1 obj = new maruthi();	
			obj.ChangeGear();
			obj.run();		
	}	
		}
		}