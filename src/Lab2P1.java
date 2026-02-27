public class Lab2P1 {
    public static void main(String[] args) {
        if (args.length < 10) {
            System.out.println("Please pass exactly 10 numbers as command line arguments.");
            return;
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(args[i]);
            if (n % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd  numbers count: " + oddCount);
    }
}
