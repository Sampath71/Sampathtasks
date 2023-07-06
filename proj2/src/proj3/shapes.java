package proj3;

public class shapes {
	
		float length,breadth,radius,base;

	}
	class rect extends shapes{
		public rect(float l,float b) {
			length = l;
			breadth = b;
		}
		float rectangle_area() {
			return length*breadth;
		}
	}
	class circle extends shapes{
		public circle(float r) {
			radius = r;
		}
		float circle_area() {
			return 3.14f *(radius*radius);
		}
	}
	class square extends shapes{
		public square(float l) {
			length = l;
		}
		float square_area() {
			return (length*length);
		}
	}
	class triangle extends shapes{
		public triangle(float b) {
			base = b;
		}
		float triangle_area() {
			return (base*base);
		}
	}



