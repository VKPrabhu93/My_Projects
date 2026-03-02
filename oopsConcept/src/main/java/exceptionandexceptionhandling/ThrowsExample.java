package exceptionandexceptionhandling;

public class ThrowsExample {

	public static void main(String[] args)throws VotingAgeException {
		int age =1;
		
		if(age>=18) {
			System.out.println("Eligible for voting");
		}
		
		else {
			throw new VotingAgeException("Age is not eligible");
		}

	}

}
