package polymorphism;

public class Area {

	public  void area(int s) {
		
		int as= s*s;
		System.out.println("Area of square  is"+" "+as);
	}
	
	public int area(int l, int b) {
		int ar = l*b;
		return ar;
	}
	
	public double area(double r) {
		
		double cr = 3.24*r*r;
		return cr;
	}
	public static void main(String[] args) {
		Area a = new Area();
		a.area(10);
		int ra =a.area(10, 20);
		System.out.println("Area of rectangle is"+" "+ra);
		double ca = a.area(15.00);
		System.out.println("Area of circe is "+ " "+ ca);
		

	}

}
