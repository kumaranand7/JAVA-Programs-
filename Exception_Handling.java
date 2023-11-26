
    public class Exception_Handling {

        static int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("divide nhi kr slte ");
            } else {
                return a / b;
            }
        }

        public static void main(String[] args) {
            try {
                divide(10, 0);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }

            System.out.println("Program continues after exception handling");
        }
    }
