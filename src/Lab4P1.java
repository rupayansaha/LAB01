abstract class StudentAbstract {
    String rollNo;
    String regNo;

    void getInput(String roll, String reg) {
        rollNo = roll;
        regNo  = reg;
    }

    abstract void course();
}

class Kiitian extends StudentAbstract {
    void course() {
        System.out.println("Course  : B.Tech. (Computer Science & Engineering)");
    }
}

public class Lab4P1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput("2405830", "1234567890");

        System.out.println("Roll No : " + k.rollNo);
        System.out.println("Reg No  : " + k.regNo);
        k.course();
    }
}