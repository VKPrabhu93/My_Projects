package defaultaccessspecifier;

public class School {

	void studentName(String name) {
		System.out.println("Student name is "+" "+ name);
	}
	public static void main(String[] args) {
		School s = new School();
		s.studentName("Vid");
	}

}
