public class Lab6P1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // array of size 4

        try {
            for (int i = 0; i <= arr.length; i++) { // intentionally goes out of bounds
                System.out.println("arr[" + i + "] = " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}