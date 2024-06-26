/*package whatever //do not write package name here */

abstract class Shape {
    String color;

    abstract double area();

    public abstract String toString();

    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is " + area();
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle("Blue", 5.42);
        System.out.println(shape.toString());
    }
}
