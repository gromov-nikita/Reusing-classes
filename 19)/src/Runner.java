/*
   Exercise 19: (2) Create a class with a blank final reference to an object. Perform the
initialization of the blank final inside all constructors. Demonstrate the guarantee that the
final must be initialized before use, and that it cannot be changed once initialized.
 */

import com.gromovlearn.A;

public class Runner {
    private final A ref;
    public Runner() {
        ref = new A();
    }
    public A getRef() {
        return ref;
    }

  /*  public void setRef(A ref) {
        this.ref = ref;
    }
*/
    public Runner(int n) {
        ref = new A();
    }
    public static void main(String[] args) {
        Runner a = new Runner();
        a.ref.setA(4);
        System.out.println(a.ref.getA());
    }
}
