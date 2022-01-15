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
