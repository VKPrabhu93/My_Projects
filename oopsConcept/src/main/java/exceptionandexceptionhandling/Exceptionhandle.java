package exceptionandexceptionhandling;

public class Exceptionhandle {

	public static void main(String[] args) {
		try {
			
			int sum =100/0;
			System.out.println(sum);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		finally {
			
			System.out.println("Finally block");
		}

	}

}
