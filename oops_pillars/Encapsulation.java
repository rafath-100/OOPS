
//A class in which each and every data member are declared as private that class is known as tighly encapsulated class.
//The following Account class is also tighly Encapsulated class.

import java.util.*;
class Account {
    private double balance;
    
    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance()
    {
        return this.balance;
    }
}

public class Encapsulation
{
    public static void main(String args[])
    {
        Account obj=new Account();
        obj.setBalance(1000);
        System.out.println(obj.getBalance());
    }
}
