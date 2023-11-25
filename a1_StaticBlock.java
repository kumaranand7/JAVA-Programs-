
    public class a1_StaticBlock {
        // Static variable to be initialized
        static int staticVariable;

        // Static block for initialization
        static {
            System.out.println("Static block is executed during class loading.");
            // Perform one-time initialization tasks
            staticVariable = 42;
        }

        // Main method
        public static void main(String[] args) {
            System.out.println("Main method is executed.");

            // Accessing the initialized static variable
            System.out.println("Static Variable: " + staticVariable);
            System.out.println(staticVariable++);
            System.out.println(staticVariable);
        }
    }
