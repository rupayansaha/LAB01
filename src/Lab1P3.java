import java.util.Scanner;
public class Lab1P3 {
    public static void main(String[] args) {
        int dayNo = 3; // 1=Sunday ... 7=Saturday

        String day;
        switch (dayNo) {
            case 1: day = "Sunday";    break;
            case 2: day = "Monday";    break;
            case 3: day = "Tuesday";   break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday";  break;
            case 6: day = "Friday";    break;
            case 7: day = "Saturday";  break;
            default: day = "Invalid day number";
        }
        System.out.println("Day No : " + dayNo);
        System.out.println("Day    : " + day);
    }
}