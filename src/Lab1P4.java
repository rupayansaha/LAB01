import java.util.Scanner;
public class Lab1P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int original = number, reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a Palindrome.");
        else
            System.out.println(original + " is NOT a Palindrome.");
    }
}