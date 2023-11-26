public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            int a = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e);
        }

        try {
            String str = null;
            // Trying to access a method or field on a null object will throw a NullPointerException
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e);
        } finally {
            System.out.println("finally");
        }
    }
}
