public class Root {
    private Component1 obj1 = new Component1();
    private Component2 obj2 = new Component2();
    private Component3 obj3 = new Component3();
    public Root() {
        System.out.println("Root");
    }
    void dispose() {
        System.out.println("delete Root");
        obj1.dispose();
        obj2.dispose();
        obj3.dispose();
    }
}
