/*
Exercise 1: (2) Create a simple class. Inside a second class, define a reference to an object
of the first class. Use lazy initialization to instantiate this object.
 */
public class Runner {
    public static void main(String[] args) {
        ContainPrintClass obj2 = new ContainPrintClass();
        obj2.print2();
        obj2.includePrintClass();
        obj2.usePrintClass().print1();
        obj2.includePrintClass();
    }
}
