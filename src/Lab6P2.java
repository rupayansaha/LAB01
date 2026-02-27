public class Lab6P2 {
    public static void main(String[] args) {
        int a = 20, b = 0;

        try {
            System.out.println("Attempting division: " + a + " / " + b);
            int result = a / b;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}