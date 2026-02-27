import java.io.*;

public class Lab7P3 {
    public static void main(String[] args) {
        // Specify the two binary files to compare
        String file1 = "file1.bin";
        String file2 = "file2.bin";

        try (FileInputStream fis1 = new FileInputStream(file1);
             FileInputStream fis2 = new FileInputStream(file2)) {

            int byte1, byte2;
            long position = 1;
            boolean areSame = true;

            while (true) {
                byte1 = fis1.read();
                byte2 = fis2.read();

                // Both streams ended simultaneously
                if (byte1 == -1 && byte2 == -1) break;

                // One stream ended before the other
                if (byte1 == -1 || byte2 == -1) {
                    areSame = false;
                    System.out.println("Files differ in size. Difference at byte position: " + position);
                    break;
                }

                if (byte1 != byte2) {
                    areSame = false;
                    System.out.println("Two files are NOT equal.");
                    System.out.println("First differing byte position: " + position);
                    break;
                }
                position++;
            }

            if (areSame) {
                System.out.println("Two files are equal.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}