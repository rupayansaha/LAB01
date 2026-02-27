public class Lab2P2 {
    static int count = 0;

    Lab2P2() {
        count++;
    }

    public static void main(String[] args) {
        Lab2P2 obj1 = new Lab2P2();
        Lab2P2 obj2 = new Lab2P2();
        Lab2P2 obj3 = new Lab2P2();
        System.out.println("Number of objects created = " + count);
    }
}
