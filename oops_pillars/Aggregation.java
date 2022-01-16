//Aggregation(HAS-A): Way of establishinh relationship between two diffferent classes through their objects is known as Agrregation which is a type of Association.
//College HAS-A faculty, which means without college the faculty may ven exists.

import java.util.ArrayList;
import java.util.List; 
class College
{
    String name;
    private List<Teacher> teacher;
    public College(String name, List<Teacher> teacher)
    {
        this.name=name;
        this.teacher=teacher;
    }
    public List<Teacher> getTeachers(){
        return teacher;
    }
}
class Teacher
{
    String name;
    String subject;
    public Teacher(String name, String sub){
        this.name=name;
        this.subject=sub;
    }
    @Override
    public String toString()
    {
        return "[Teacher:"+name+" ,Subject:"+subject+"]";    
    }
}


public class Aggregation {
    public static void main(String args[])
    {
        List<Teacher> teachers=new ArrayList<Teacher>();
        teachers.add(new Teacher("Rafath","Java"));
        teachers.add(new Teacher("Ali","C++"));

        College obj=new College("My college",teachers);
        System.out.println(obj.getTeachers());

    }
}
