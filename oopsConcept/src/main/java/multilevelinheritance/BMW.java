package multilevelinheritance;

public class BMW extends Car {

	public void bmw_cost() {
		System.out.println("Cost will be mentioned later");
	}
	public static void main(String[] args) {
		BMW b =new BMW();
		b.vehicle_colour();
		b.car_wheels();
		b.bmw_cost();
		

	}

}
