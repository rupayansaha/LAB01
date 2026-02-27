import java.util.Scanner;
import java.io.*;

public class Lab7P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters (excluding newline characters)
                charCount += line.length();

                // Count words (split by whitespace)
                if (!line.trim().isEmpty()) {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }

            System.out.println("\nFile  : " + fileName);
            System.out.println("No. of characters : " + charCount);
            System.out.println("No. of lines      : " + lineCount);
            System.out.println("No. of words      : " + wordCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}