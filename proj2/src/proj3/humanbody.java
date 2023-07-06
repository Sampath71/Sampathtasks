package proj3;

public class humanbody {
	 public void displayhuman() {
		 System.out.println("i am a human");
	 }
	

}
interface Male{
	public void show();
}
interface Female{
	public void show();
}
class child extends humanbody implements Male,Female{
	public void show() {
	System.out.println("implements both,male and female");
}

public void displaychild(){
	System.out.println("method inside child class");
	
}
public static void main(String args[]) {
	child obj = new child();
	System.out.println("imolent hybrid and mutiple in java");
	obj.show();
	obj.displaychild();
}
}