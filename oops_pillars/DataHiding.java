class Account
{
    private double balance=10000;
    private String username="Rafath Ali";
    private String password="password";

    public double getWalletBalance(String username, String password)
    {
        if(this.username.equals(username) && this.password.equals(password))
        {
            return this.balance;
        }
        else 
        {
            return 0.0;
        }
    }
}
public class DataHiding 
{
    public static void main(String args[])
    {
        Account obj=new Account();
        double bal=obj.getWalletBalance("Rafath Ali","password");
        System.out.println(bal);
    }    
}
