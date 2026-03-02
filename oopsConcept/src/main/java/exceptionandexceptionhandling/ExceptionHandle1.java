package exceptionandexceptionhandling;

public class ExceptionHandle1 {

	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[5]=10/0;
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
