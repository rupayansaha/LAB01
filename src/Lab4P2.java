interface Motor {
    int capacity = 500; // constant (implicitly public static final)
    void run();
    void consume();
}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine is running.");
    }
    public void consume() {
        System.out.println("Power consumed by motor.");
    }
}

public class Lab4P2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        System.out.println("Capacity of the motor is " + wm.capacity + " watts");
    }
}