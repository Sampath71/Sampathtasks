package hybrid;

import java.lang.reflect.Modifier;


	public class Main{
		public static void main(String args[]) {
			
			try {
				data d = new data();
				Class obj = d.getClass();
				String name = obj.getName();
				System.out.println(name);
				int modifier = obj.getModifiers();
				String mod = Modifier.toString(modifier);
				System.out.println(mod);
				Class superClass = obj.getSuperclass();
				System.out.println(superClass.getName());
			
		
	
			

			

}catch(Exception e) {
        e.printStackTrace();
	 
}

	}


}
