package hybrid;

public class value {
	public int sum(int x,int y) {
	return(x+y);
	}
	public int sum(int x,int y,int z) {
		return(x+y+z);
		}
	public double sum(double x,double y) {
		return(x+y);
		}
	public double sum(double x,double y,double z) {
		return(x+y+z);
		}
	public static void main(String[] args) {
		value v = new value();
		System.out.println(v.sum(10,20));
		System.out.println(v.sum(10,20,30));
		System.out.println(v.sum(10.5,12.5));
		

	}
	
	}


