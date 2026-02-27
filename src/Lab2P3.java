import java.util.Scanner;

class Box {
    double length, width, height;

    double volume() {
        return length * width * height;
    }
}

public class Lab2P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box b = new Box();
        System.out.print("Enter Length : "); b.length = sc.nextDouble();
        System.out.print("Enter Width  : "); b.width  = sc.nextDouble();
        System.out.print("Enter Height : "); b.height = sc.nextDouble();
        System.out.println("Volume = " + b.volume());
    }
}