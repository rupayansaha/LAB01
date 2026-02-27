import java.util.Scanner;

class Account {
    int accNo;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account No : "); accNo   = sc.nextInt();
        System.out.print("Balance    : "); balance = sc.nextDouble();
    }

    void disp() {
        System.out.println("Account No : " + accNo);
        System.out.println("Balance    : " + balance);
    }
}

class Person extends Account {
    String name;
    String aadharNo;

    void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Name       : "); name      = sc.next();
        System.out.print("Aadhar No  : "); aadharNo  = sc.next();
    }

    @Override
    void disp() {
        super.disp();
        System.out.println("Name       : " + name);
        System.out.println("Aadhar No  : " + aadharNo);
    }
}

public class Lab3P4 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");
            persons[i] = new Person();
            persons[i].input();
        }
        System.out.println("\n===== All Person Details =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Person " + (i + 1) + " ---");
            persons[i].disp();
        }
    }
}