package hybrid;

public class data {
	
	private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
class pg extends data{
	public static void main(String args[]) {
		data d = new data();
		d.setName("sampu");
		System.out.println(d.getName());
	}
}
