package functions;

public class Car {
	String colour;
	int capacity;
	public void features()
	{
		System.out.println("Car features are. Colour="+colour+ ", and capacity=" +capacity);
	}
	
	public Car(String colour, int capacity)
	{
		this.colour=colour;
		this.capacity=capacity;
	}
	public Car()
	{
		
	}

}
