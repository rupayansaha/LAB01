import java.util.Scanner;

class InvalidHourException extends Exception {
    InvalidHourException(String msg) { super(msg); }
}
class InvalidMinuteException extends Exception {
    InvalidMinuteException(String msg) { super(msg); }
}
class InvalidSecondException extends Exception {
    InvalidSecondException(String msg) { super(msg); }
}

class Time {
    int hours, minutes, seconds;

    void getTime() throws InvalidHourException, InvalidMinuteException, InvalidSecondException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours   : "); hours   = sc.nextInt();
        System.out.print("Enter minutes : "); minutes = sc.nextInt();
        System.out.print("Enter seconds : "); seconds = sc.nextInt();

        if (hours < 0 || hours > 24)
            throw new InvalidHourException("InvalidHourException: hour should be between 0 and 24");
        if (minutes < 0 || minutes > 60)
            throw new InvalidMinuteException("InvalidMinuteException: minute should be between 0 and 60");
        if (seconds < 0 || seconds > 60)
            throw new InvalidSecondException("InvalidSecondException: second should be between 0 and 60");
    }
}

public class Lab6P4 {
    public static void main(String[] args) {
        Time t = new Time();
        try {
            t.getTime();
            System.out.println("Correct Time -> " + t.hours + ":" + t.minutes + ":" + t.seconds);
        } catch (InvalidHourException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (InvalidMinuteException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } catch (InvalidSecondException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}