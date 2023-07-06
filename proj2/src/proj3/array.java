package proj3;

public class array {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[11];
		
		arr[0] = 10;
		arr[1] = 100;
		arr[2] = 1;
		arr[3] = 0;
		arr[4] = 5;
		arr[5] = 6;
		arr[6] = 8;
		arr[7] = 9;
		arr[8] = 11;
		arr[9] = 14;
		arr[10] = 15;
		for(int j = 0; j<arr.length;j++)
		System.out.println("element of index" +j+"-"+arr[j]);

	}

}
