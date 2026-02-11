package hierarchicalinheritance;

public class BMW extends Car{

	public int bmw_wheel(int n) {
		int x= n;
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		b.car_display();
		int i = b.bmw_wheel(4);
		System.out.println("Number of wheels in BMW is"+" "+i);
	}

}
