package runtimepolymorphism;

public class GreenLight extends TrafficLight{

	public void displaylight(String colour) { //Same method as in parent class
		//super.displaylight("Red");
		System.out.println("The light colour in this greenlight is"+" "+colour);
	}
	public static void main(String[] args) {
		TrafficLight tl = new GreenLight();// upcasting
		tl.displaylight("Yellow");
		GreenLight gl = new GreenLight();
		gl.displaylight("Green");

	}

}
