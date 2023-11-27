
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionFileNotFoundEg {

    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "C:\\Users\\Anand\\OneDrive\\Desktop\\abc.txst";

            // Create a PrintWriter object with the specified file path
            PrintWriter pw = new PrintWriter(filePath);

            // Write some text to the file
            pw.println("Hello My name is Anand: ");

            // Close the PrintWriter to ensure that the data is flushed and the file is properly closed
            pw.close();

            System.out.println("Data written to the file successfully.");
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

