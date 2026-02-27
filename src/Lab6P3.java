import java.util.Scanner;

class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

public class Lab6P3 {
    static void processInput(int number) throws NegativeNumberException {
        if (number < 0)
            throw new NegativeNumberException("NegativeNumberException: number should be positive");
        System.out.println("Double value: " + (number * 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        try {
            processInput(n);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}