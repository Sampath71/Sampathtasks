package proj3;

public class hierachial {

	public static void main(String[] args) {
		rect a1 =new rect(2,5);
		System.out.println("Area of rectangle: "+a1.rectangle_area());
		circle a2 =new circle(5);
		System.out.println("Area of circle: "+a2.circle_area());
		square a3 =new square(3);
		System.out.println("Area of square: "+a3.square_area());
		triangle a4 =new triangle(6);
		System.out.println("Area of triangle: "+a4.triangle_area());

	}

}
