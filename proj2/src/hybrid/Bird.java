package hybrid;
import java.util.*;
public class Bird {
	
	String name;
	int size;
	int strength;
	protected void attack() {
		
	}
	public String getName() {
		return name;
	}
	
	
}
class pigeon extends Bird{
	public void attack() {
	}
}
class parrot extends Bird{
	public void attack() {
	}
}

