/*package whatever //do not write package name here */

interface Shape {
    
    String color_name = "YELLOW";
    String getColor(String color);
    
}

class Circle implements Shape {
    
    String color_name;
    
    public String getColor(String color){
        return this.color_name=color; 
    }

   

    @Override
    public String toString() {
        return "color name is " + this.getColor("BLUE") + ", " + "parent_color name is " + Shape.color_name;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle();
        System.out.println(shape.toString());
    }
}
