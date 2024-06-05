public class Staicc_example {

    // Static variable 'a' is declared and initialized with the value 10.
    static int a = 10;

    // The main method, the entry point of the program.
    public static void main(String[] args) {

        // Creating an instance (object) of the Staicc_example class.
        Staicc_example obj = new Staicc_example();

        // Accessing the static variable 'a' using the object 'obj'.
        System.out.println(obj.a);

        // Accessing the static variable 'a' directly using the class name.
        System.out.println(Staicc_example.a);

        // Accessing the static variable 'a' directly without using the class name.
        // This is valid but not recommended for clarity.
        System.out.println(a);
    }
}
