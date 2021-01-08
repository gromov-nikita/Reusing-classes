/*
Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object
of the first class. Use lazy initialization to instantiate this object.
 */
public class class2 {
    public class1 obj1;
    public void includeClass1() {
        if (obj1 == null) {
            obj1 = new class1();
        }
        else {
            System.out.println("The class1 already included");
        }
    }
    public void print2() {
        System.out.println("class2");
    }
}
