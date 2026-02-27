class Apple {
    void show() {
        System.out.println("Apple's show() method");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("Banana's show() method");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("Cherry's show() method");
    }
}

public class Lab3P3 {
    public static void main(String[] args) {
        Apple obj;

        obj = new Apple();
        obj.show();

        obj = new Banana();
        obj.show();

        obj = new Cherry();
        obj.show();
    }
}