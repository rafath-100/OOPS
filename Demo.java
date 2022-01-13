class Fan
{
	private boolean isOn;
	public void turnOn(){
		isOn=true;
		System.out.println("fan is spinning");
	}
	
	public void turnOff(){
		isOn=false;
		System.out.println("fan is stop");
	}
}

public class Demo
{
	public static void main(String args[])
	{
		Fan obj=new Fan();
		obj.turnOn();
	}
} 

	
