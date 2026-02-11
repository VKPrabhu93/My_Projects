package hierarchicalinheritance;

public class Tiago extends Car{
	
	public void tiago_wheel() {
		System.out.println("Number of wheels in tiago is 4!!!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiago t = new Tiago();
		t.car_display();
		t.tiago_wheel();	
	}

}
