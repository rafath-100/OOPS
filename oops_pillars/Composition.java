//Composition: Its is a stronger form of Association, here two entities are dependent on eachother.
class House
{
    private Kitchen kitchen;
    public House()
    {
        kitchen =new Kitchen();
        kitchen.setFood("Ice-cream");
    }

    public String getFood()
    {
        return kitchen.getFood();
    }
}

class Kitchen
{
    private String food;
    public void setFood(String food)
    {
        this.food=food;
    }
    public String getFood()
    {
        return food;
    }
}

public class Composition 
{
    public static void main(String args[])    
    {
        House house=new House();
        System.out.println(house.getFood());
    }
}
