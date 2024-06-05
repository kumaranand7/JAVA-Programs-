
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionFileNotFoundEg {

    public static void main(String[] args) {
        try {
            // Specify the file path
            String filePath = "C:\\Users\\Anand\\OneDrive\\Desktop\\new_file.txt";  //if file does not exist a new file will be created (refresh)

            // Create a PrintWriter object with the specified file path
            PrintWriter pw = new PrintWriter(filePath);

            // Write some text to the file
            for(int i=1; i<=10; i++){

                pw.println(i+ " Hello My name is Anand:");
                pw.println(i+" My name is Harry: ");
                pw.println();
            }
            // Close the PrintWriter to ensure that the data is flushed(data goes to buffer(temp storage) then permanent storage) and the file is properly closed
            pw.close();

            System.out.println("Data written to the file successfully.");
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            e.printStackTrace();
            System.out.println(e);
        }
    }
}

