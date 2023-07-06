package hybrid;

public class overloading {
	public void student(String name,int RollNo) {
		System.out.println(name+RollNo);
	}
	public void student(int rollno,String name) {
		System.out.println(rollno+name);
	}
	public static void main(String[] args) {
	overloading obj = new overloading();
	obj.student("sampu",1);
	obj.student(2,"santhosh");
	
	

}
}