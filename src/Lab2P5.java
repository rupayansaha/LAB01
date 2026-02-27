import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class Lab2P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("\n--- Student " + (i + 1) + " ---");
            System.out.print("Roll No : "); students[i].roll = sc.nextInt();
            System.out.print("Name    : "); students[i].name = sc.next();
            System.out.print("CGPA    : "); students[i].cgpa = sc.nextDouble();
        }

        System.out.println("\n--- All Student Details ---");
        int lowestIdx = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].roll + " | " + students[i].name + " | " + students[i].cgpa);
            if (students[i].cgpa < students[lowestIdx].cgpa) lowestIdx = i;
        }
        System.out.println("\nStudent with Lowest CGPA: " + students[lowestIdx].name);
    }
}