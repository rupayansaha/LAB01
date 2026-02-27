class MathOps {
    int subtract(int a, int b) {
        return a - b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class Lab2P6 {
    public static void main(String[] args) {
        MathOps obj = new MathOps();
        System.out.println("subtract(10, 3)        = " + obj.subtract(10, 3));
        System.out.println("subtract(10.5, 3.2)    = " + obj.subtract(10.5, 3.2));
        System.out.println("subtract(20, 5, 3)     = " + obj.subtract(20, 5, 3));
    }
}