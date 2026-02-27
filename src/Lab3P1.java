import java.util.Scanner;

class Sheet2D {
    double length, width;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length : "); length = sc.nextDouble();
        System.out.print("Enter Width  : "); width  = sc.nextDouble();
    }

    double area() {
        return length * width;
    }

    void costSheet() {
        System.out.println("Cost of 2D Sheet = Rs " + (area() * 40));
    }
}

class Box3D extends Sheet2D {
    double height;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height : "); height = sc.nextDouble();
    }

    double volume() {
        return length * width * height;
    }

    void costBox() {
        System.out.println("Cost of 3D Box = Rs " + (volume() * 60));
    }
}

public class Lab3P1 {
    public static void main(String[] args) {
        System.out.println("--- 2D Sheet ---");
        Sheet2D sheet = new Sheet2D();
        sheet.input();
        sheet.costSheet();

        System.out.println("\n--- 3D Box ---");
        Box3D box = new Box3D();
        box.input();
        box.costBox();
    }
}