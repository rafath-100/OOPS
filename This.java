import java.util.*;
class Student 
{
    String name;
    int rollno;
    float fee;
    Student(int rollno, String name, float fee)
    {
        this.rollno=rollno; //if we donot use this keyword here,
        this.name=name;     //then we will be getting null values.
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}

public class This 
{
    public static void main(String args[])
    {
        Student s1=new Student(91,"Rayees",500f);
        Student s2=new Student(100,"Rafath",600f);
        s1.display();
        s2.display();
    }    
}
