/*
Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object
of the first class. Use lazy initialization to instantiate this object.
 */
public class ContainPrintClass {
    private PrintClass obj1;
    public void includePrintClass() {
        if (obj1 == null) {
            obj1 = new PrintClass();
        }
    }
    public PrintClass usePrintClass() {
        return obj1;
    }
    public void print2() {
        System.out.println("class2");
    }
}
