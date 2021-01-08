/*
Exercise 18: (2) Create a class with a static final field and a final field and
demonstrate the difference between the two.
 */
public class Runner {
    private static final int a = 3;
    private final int b;
    public Runner(int n) {
        b = n;
    }

    public static int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        Runner obj = new Runner(10000);
        System.out.println(obj.getB());
        System.out.println(Runner.getA());
    }

}
