class Shape {

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Shape_Area_Calculation_Method_Overriding {

    public static void main(String[] args) {

        Circle ci = new Circle(2.75);
        Rectangle ra = new Rectangle(5.25, 8.75);

        System.out.printf("Area of Circle: %.2f%n", ci.calculateArea());
        System.out.printf("Area of Rectangle: %.2f%n", ra.calculateArea());
    }
}