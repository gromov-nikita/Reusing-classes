/*
Exercise 16: (2) Create a class called Amphibian. From this, inherit a class called
Frog. Put appropriate methods in the base class. In main( ), create a Frog and upcast it to
Amphibian and demonstrate that all the methods still work.
Exercise 17: (1) Modify Exercise 16 so that Frog overrides the method definitions from
the base class (provides new definitions using the same method signatures). Note what
happens in main( ).
 */
public class Runner {
    public static void main(String[] args) {
        Frog objF = new Frog();
        Amphibian objA = new Frog();
        objF.move(10);
        objF.swim(5);
        objF.voice();
        objF.move(5);
        objF.swim(2);
        objF.voice();

    }
}
