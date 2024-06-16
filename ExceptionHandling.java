public class ExceptionHandling {

    public static void main(String[] args) {

        try {

            int a = 10 / 0;
            
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Exception handled sucessfully:");

        }
    }

}
