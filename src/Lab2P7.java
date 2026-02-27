import java.util.Scanner;

class RectArea {
    double length, breadth;

    // Default constructor
    RectArea() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    RectArea(double l, double b) {
        length  = l;
        breadth = b;
    }

    void displayArea() {
        System.out.println("Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area   = " + (length * breadth));
    }
}

public class Lab2P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RectArea r1 = new RectArea(); // default
        System.out.println("--- Default Constructor ---");
        r1.displayArea();

        System.out.print("\nEnter Length  : ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth : ");
        double b = sc.nextDouble();
        RectArea r2 = new RectArea(l, b); // parameterized
        System.out.println("\n--- Parameterized Constructor ---");
        r2.displayArea();
    }
}