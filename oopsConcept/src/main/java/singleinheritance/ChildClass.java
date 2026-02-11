package singleinheritance;

public class ChildClass extends ParentClass {

	public void calculate(int s) {
		int area= s*s;
		System.out.println("Area is "+" "+area);
	}
	public static void main(String[] args) {
		ChildClass cs = new ChildClass();
		cs.calculate(10);
		cs.display();

	}

}
