package oops_pillars;
import java.util.ArrayList;

//Abstraction through Interface
interface Mobile
{
    void call(String number);
    void send(String number);
}

class Apple implements Mobile
{
    private ArrayList<String> contacts=new ArrayList<>();
    public void call(String number)
    {
        System.out.println("Calling to ..."+number);
    }
    public void send(String number)
    {
        System.out.println("Sending to ..."+number);
    }
    public void addContacts(String number)
    {
        contacts.add(number);
    }
    public void showContacts()
    {
        for(String con: contacts){
            System.out.println(con);
        }
    }
}

// Abstraction throught Abstract classes
abstract class Phone {
    private ArrayList<String>  contacts  = new ArrayList<>();
    public abstract void call(String number);
    public abstract void send(String number);
    public void addContacts(String number){
        contacts.add(number);
    }
    public void showContacts(){
        for(String con : contacts){
            System.out.println(con);
        }
    }

}
class Samsung extends Phone 
{
    public void call(String number)
    {
        System.out.println("Calling to ..."+number);
    }
    public void send(String number)
    {
        System.out.println("Sending to ..."+number);
    }
}

public class Abstraction{
    public static void main(String args[])
    {
        Apple myPhone = new Apple();
        myPhone.call("9877689");
        myPhone.send("2342432");
        myPhone.addContacts("2342");
        myPhone.addContacts("2345");
        myPhone.addContacts("5433");
        myPhone.showContacts();

        Samsung myNewPhone = new Samsung();
        myNewPhone.call("23423");
        myNewPhone.send("92384");
        myNewPhone.addContacts("09234");
        myNewPhone.addContacts("209374");
        myNewPhone.addContacts("92384");
        myNewPhone.showContacts();
    }
}