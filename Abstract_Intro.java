abstract class A {
    public abstract void absMethod();
    public void message()
    {
        System.out.println("this is a non-abstract method");
    }
}

class B extends A 
{
    public void absMethod()
    {
        System.out.println("the abstract method is implemented in its sub class");
    }

    public void message2()
    {
        System.out.println("this is a sub class method");
    }
}

public class Abstract_Intro
{
    public static void main(String args[])
    {
        A obj=new B();
        obj.absMethod();
        obj.message();

        B obj2=new B();
        obj2.absMethod();
        obj2.message2();
    }
}
