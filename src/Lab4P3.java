import java.util.Scanner;

interface Salary {
    double earnings();
    double deductions();
    double bonus();
}

abstract class Manager implements Salary {
    double basic;

    Manager(double basic) {
        this.basic = basic;
    }

    public double earnings() {
        double da  = 0.80 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    public double deductions() {
        return 0.12 * basic;
    }

    // bonus() not implemented here (abstract in effect)
}

class Substaff extends Manager {
    Substaff(double basic) {
        super(basic);
    }

    public double bonus() {
        return 0.50 * basic;
    }
}

public class Lab4P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        Substaff ss = new Substaff(basic);
        System.out.println("Earnings   : " + ss.earnings());
        System.out.println("Deductions : " + ss.deductions());
        System.out.println("Bonus      : " + ss.bonus());
    }
}