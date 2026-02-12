package superKeyword;

public class Car_Method_Invoke extends Vehicle_Method_Invoke {

	public void display_colour(String colour)
	{
		super.display_colour("Green"); 
		System.out.println("This car colour is"+" "+colour);
	}
	public static void main(String[] args) {
		Car_Method_Invoke cmi = new Car_Method_Invoke();
		cmi.display_colour("Red");
	}

}
