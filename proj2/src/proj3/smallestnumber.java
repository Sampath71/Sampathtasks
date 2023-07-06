package proj3;

public class smallestnumber {
	
		
		public int small(int a, int b, int c) {
			if(a<b&&a<c) {
				System.out.println("a is smaller");
			}
			else if(b<c&&b<a) {
				System.out.println("b is smaller");
			}
			else {
				System.out.println("c is smaller");
			}
			return 0;
		}
		public static void main(String[] args) {
			
	int n1 = 65;
	int n2 = 87;
	int n3 = 95;
	smallestnumber obj = new smallestnumber();
	int result = obj.small(n1,n2,n3);
	System.out.println(result);
		}

	}



