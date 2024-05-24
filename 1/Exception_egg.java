 public class Exception_egg {
             public static void main (String[]args){

         // Initializing a String variable to null
         String str = null;

         try {
             // Attempting to get the length of the null string (will result in a NullPointerException)

             int a = str.length();
             // The code inside the try block will throw an exception, so the control will directly move to the catch block.
             // The next line won't be executed if an exception occurs.

             // Note: The corrected code should handle the exception and not let the program terminate abruptly.
         }
         catch (NullPointerException e) {
             // Handling the NullPointerException and printing an error message
             System.out.println("Error: " + e.getMessage());
         } finally {
             // The code inside the finally block will be executed, whether an exception occurs or not
             System.out.println("Finally block");
         }

         // The rest of the code will be executed after handling the exception (if any)
         System.out.println("Rest of the code");
     }
     }
