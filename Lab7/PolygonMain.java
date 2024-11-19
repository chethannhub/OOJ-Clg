interface Polygon {
	default void getPerimeter(int sides[]) {
		int perimeter = 0;
		for(int i=0; i<sides.length; i++) {
			perimeter += sides[i];
		}
		System.out.println("Perimeter: " + perimeter);
	}

	void getArea(int sideLength1, int sideLength2);
}

class Square implements Polygon {
	public void getArea(int sideLength1, int sideLength2) {
		System.out.println("Square Area: " + sideLength1*sideLength2);
	}
}

class Rectangle implements Polygon {
	public void getArea(int sideLength1, int sideLength2) {
		System.out.println("Rectangle Area: " + sideLength1*sideLength2);
	}
}

  

public class PolygonMain {
    	public static void main(String args[]) {
		Square s1 = new Square();
		s1.getArea(5,5);

		int sq_sides[] = {5,5,5,5};
		s1.getPerimeter(sq_sides);


		Rectangle r1 = new Rectangle();
		r1.getArea(5,6);

		int rect_sides[] = {5,6,5,6};
		r1.getPerimeter(rect_sides);
	}
}
