package abstractionwithinterface;

public class Car implements Vehicle{

	public void display() {
		System.out.println("Displaying in car class");
	}
	public static void main(String[] args) {
		Car c = new Car();
		c.display();
		int n = c.engine_cc();
		String sr= c.model_name();
		c.wheelNumber();
		System.out.println(n +" "+ sr);

	}

	@Override
	public void wheelNumber() {
		System.out.println("Number of wheels is 4");
		
	}

	@Override
	public String model_name() {
		System.out.println("Model name is BMW");
		return "BMW";
	}

	@Override
	public int engine_cc() {
		System.out.println("Engine cc is 300");
		return 4;
	}

}
