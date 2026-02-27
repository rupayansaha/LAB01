import java.util.Scanner;

class Rectangle {
    double length, breadth;

    // Constructor with parameters
    Rectangle(double l, double b) {
        length  = l;
        breadth = b;
    }

    void read() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length  : "); length  = sc.nextDouble();
        System.out.print("Enter Breadth : "); breadth = sc.nextDouble();
    }

    void calculate() {
        System.out.println("Area      = " + (length * breadth));
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }

    void display() {
        System.out.println("Length = " + length + ", Breadth = " + breadth);
    }
}

public class Lab2P4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0);
        r.read();
        r.display();
        r.calculate();
    }
}