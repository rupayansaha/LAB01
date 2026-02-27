import java.util.Scanner;
import java.io.*;

public class Lab7P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name to write student details: ");
        String fileName = sc.nextLine();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // flush newline

        // ---- WRITE to file ----
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Student " + (i + 1) + " ---");
                System.out.print("Roll No : "); String roll    = sc.nextLine();
                System.out.print("Name    : "); String name    = sc.nextLine();
                System.out.print("Subject : "); String subject = sc.nextLine();
                System.out.print("Marks   : "); String marks   = sc.nextLine();

                pw.println(roll + " | " + name + " | " + subject + " | " + marks);
            }
            System.out.println("\nData written to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // ---- READ from file ----
        System.out.println("\n--- Contents of " + fileName + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}