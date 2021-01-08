public class Stem extends Root {
    public Component1 obj1Stem = new Component1();
    public Component2 obj2Stem = new Component2();
    public Component3 obj3Stem = new Component3();
    public Stem() {
        System.out.println("Stem");
    }
    @Override
    void dispose() {
        System.out.println("delete Stem");
        obj1Stem.dispose();
        obj2Stem.dispose();
        obj3Stem.dispose();
        super.dispose();

    }
}
