/*Exercise 9: (2) Create a class called Root that contains an instance of each of the classes
(that you also create) named Component1, Component2, and Component3. Derive a
class Stem from Root that also contains an instance of each “component.” All classes should
have default constructors that print a message about that class.
Exercise 10: (1) Modify the previous exercise so that each class only has non-default
constructors.
*/
public class Root {
    public Component1 obj1 = new Component1();
    public Component2 obj2 = new Component2();
    public Component3 obj3 = new Component3();
    public Root(int n){
        System.out.println("Root ");
    }
}
