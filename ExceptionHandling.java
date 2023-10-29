import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            File myFile = new File("filename.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
