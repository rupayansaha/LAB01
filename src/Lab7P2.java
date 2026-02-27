import java.util.Scanner;
import java.io.*;

public class Lab7P2 {

    // ---- Method 1: Character Stream ----
    static void copyUsingCharStream(String src, String dest) {
        try (FileReader fr = new FileReader(src);
             FileWriter fw = new FileWriter(dest)) {

            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }
            System.out.println("File copied using Character Stream -> " + dest);

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error (Character Stream): " + e.getMessage());
        }
    }

    // ---- Method 2: Byte Stream ----
    static void copyUsingByteStream(String src, String dest) {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
            System.out.println("File copied using Byte Stream -> " + dest);

        } catch (FileNotFoundException e) {
            System.out.println("Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error (Byte Stream): " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter source file name      : ");
        String srcFile = sc.nextLine();

        System.out.print("Enter destination file name (char stream): ");
        String destChar = sc.nextLine();
        copyUsingCharStream(srcFile, destChar);

        System.out.print("Enter destination file name (byte stream): ");
        String destByte = sc.nextLine();
        copyUsingByteStream(srcFile, destByte);
    }
}