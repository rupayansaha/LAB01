import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface ManagerI extends Employee {
    void getDeptDetails();
}

class Head implements ManagerI {
    int empId, deptId;
    String empName, deptName;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID   : "); empId   = sc.nextInt();
        System.out.print("Enter Employee Name : "); empName = sc.next();
    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department ID   : "); deptId   = sc.nextInt();
        System.out.print("Enter Department Name : "); deptName = sc.next();
    }

    void display() {
        System.out.println("\nEmployee ID     : " + empId);
        System.out.println("Employee Name   : " + empName);
        System.out.println("Department ID   : " + deptId);
        System.out.println("Department Name : " + deptName);
    }
}

public class Lab4P4 {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}