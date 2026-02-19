package finalkeyword;

public class Green_Light_Final_Method extends Traffic_Light_Final_Method {

	/*public void displaylight() {
		
	}*/  //---------------->Cannot override final method
	public void displaylightgreen() {
		System.out.println("Green light is displayed");
	}
	public static void main(String[] args) {
		
		Green_Light_Final_Method glfm = new Green_Light_Final_Method();
		glfm.displaylight();
		glfm.displaylightgreen();
		

	}

}
