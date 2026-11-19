abstract class abstractClass {
    // Abstract method
    abstract void abstractMethod();
    // Concrete method
    void concreteMethod() {
        System.out.println("This is a concrete method.");
    }
}
// Implementation of the abstract method
class B extends abstractClass {
    void abstractMethod() {
        System.out.println("B's implementation of abstractMethod.");
    }
}
class C extends abstractClass {
    void abstractMethod() {
        System.out.println("C's implementation of abstractMethod.");
    }
}
public class Task14 {
    public static void main(String args[]) {
        B b = new B();
        b.abstractMethod();
        b.concreteMethod();

        C c = new C();
        c.abstractMethod();
        c.concreteMethod();
    }
}
