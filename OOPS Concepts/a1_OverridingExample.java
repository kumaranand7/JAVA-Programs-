// Superclass
class Shape {
    int a = 10;

    // Method in the superclass
    void draw() {
        System.out.println("Drawing a shape");
    }
} 

// Subclass that extends Shape  //
class Circle extends Shape {
    int a = 20;

    // Method in the subclass that overrides the draw method in the superclass
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    // Additional method specific to Circle class
    void calculateArea() {
        System.out.println("Calculating the area of a circle");
    }
}

// Main class
public class a1_OverridingExample {
    public static void main(String[] args) {

        // Creating an object of the Shape class
        Shape obj1 = new Shape();
        obj1.draw();  // Calls the draw method of the Shape class

        // Creating an object of the Circle class
        Circle obj2 = new Circle();
        obj2.draw();  // Calls the overridden draw method of the Circle class
        obj2.calculateArea();  // Calls the calculateArea method of the Circle class

        // Creating an object of the Circle class but stored in a Shape reference
        Shape obj3 = new Circle();
        obj3.draw();  // Calls the overridden draw method of the Circle class
        // obj3.calculateArea();  // This line is not possible because the reference type is Shape
        System.out.println(obj3.a);  // Accesses the 'a' variable of the Shape class

    }
}
 
