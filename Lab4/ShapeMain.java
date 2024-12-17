abstract class Shape {
    private int dim1, dim2;

    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public abstract void printArea();
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        super(length, breadth);
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        int area = length * breadth;
        System.out.println("Rectangle area: " + area);
    }
}

class Triangle extends Shape {
    int height;
    int breadth;

    Triangle(int height, int breadth) {
        super(height, breadth);
        this.height = height;
        this.breadth = breadth;
    }

    public void printArea() {
        double area = 0.5 * height * breadth;
        System.out.println("Triangle area: " + area);
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        super(radius, radius);
        this.radius = radius;
    }

    public void printArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 5);
        Triangle t = new Triangle(6, 5);
        Circle c = new Circle(5);

        r.printArea();
        t.printArea();
        c.printArea();
    }
}
