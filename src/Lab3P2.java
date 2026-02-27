import java.util.Scanner;

class Plate {
    double length, width;

    Plate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : "); length = sc.nextDouble();
        System.out.print("Enter Width  : "); width  = sc.nextDouble();
        System.out.println("Plate constructor called.");
    }
}

class BoxLevel extends Plate {
    double height;

    BoxLevel() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height : "); height = sc.nextDouble();
        System.out.println("Box constructor called.");
    }
}

class WoodBox extends BoxLevel {
    double thick;

    WoodBox() {
        super();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Thickness : "); thick = sc.nextDouble();
        System.out.println("WoodBox constructor called.");
        System.out.println("\nDimensions -> Length=" + length + " Width=" + width
                + " Height=" + height + " Thickness=" + thick);
    }
}

public class Lab3P2 {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox();
    }
}