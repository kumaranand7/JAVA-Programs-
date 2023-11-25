// Outer class
public class a1_OuterClass {

    // Static nested class within a1_OuterClass
    static class Innerclass {

        // Method in the inner class
        void f1() {
            System.out.println("Inner class");
        }
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {

        // Creating an object of the Innerclass
        a1_OuterClass.Innerclass obj = new a1_OuterClass.Innerclass();

        // Calling the f1 method of the Innerclass
        obj.f1();
    }
}
