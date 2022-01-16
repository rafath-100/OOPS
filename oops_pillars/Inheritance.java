//package oops_pillars;
// Inheritance : It is a mechanism to create a new class called as child class, deriving the old class which is known as the parent class.
// Inheritance is of two types IS-A and HAS-A relationship.
// Single Level
class A {
    public int var;
    A() {
        System.out.println("A's constructor is called");
        var = 20;
    }
    public void detailsA(){
        System.out.println("A is a super class");
    }
}

class B extends A {
    public int varb;
    B() {
        // calls A's constructor first
        System.out.println("B's constructor is called");
        System.out.println("The value of var in Class A is  "+ var);
        varb = 10;
    }
    public void detailsB(){
        System.out.println("B is a sub class");
    }
}

// multi level 
class C extends B {
    C() {
        System.out.println("C's constructor is called");
        System.out.println("The value of varb in class B is " + varb);
    }
    public void detailsC() {
        System.out.println("C is sub class of B which in turn is Sub class of A");
    }
}

// Hierarchical : Here Single parent has multiple child class e.g : C extends B and D extends B
class D extends B {
    D() {
        System.out.println("D's costructor is called");
    }
    public void detailsD() {
        System.out.println("D is a sub class of B which is also a parent class of C");
    }
}

// Multiple : Multiple inheritance is not supported through class but can be implemented using interface

interface E {
    void method();
    default void overComeDiamondProblem() {
        System.out.println("This is interface E");
    }
}
interface F {
    void method();
    default void overComeDiamondProblem() {
        System.out.println("This is interface F");
    }
}

class G implements E,F {
    public void method(){
        System.out.println("This is to demonstrate multiple inheritance");
    }
    public void overComeDiamondProblem() {
        F.super.overComeDiamondProblem();
        E.super.overComeDiamondProblem();
    }
}

public class Inheritance {
    public static void main(String args[]){
        A a = new A();
        a.detailsA();
        B b = new B();
        b.detailsA();
        b.detailsB();

        C c = new C();
        c.detailsA();
        c.detailsB();
        c.detailsC();

        D d = new D();
        d.detailsA();
        d.detailsB();
        d.detailsD();

        G g = new G();
        g.method();
        g.overComeDiamondProblem();
    }
}