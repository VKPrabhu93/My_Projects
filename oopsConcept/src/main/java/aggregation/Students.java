package aggregation;

public class Students {

	int studentid;
	String course;
	College cg;
	public Students(int studentid, String course,College cg) {
		
		this.cg=cg;
		this.studentid=studentid;
		this.course=course;
		
	}
	
	public void display() {
		System.out.println("Student name is "+" "+cg.name);
		System.out.println("Student age is "+" "+cg.age);
		System.out.println("Student id is "+" "+studentid);
		System.out.println("Student course is "+" "+course);
	}
	public static void main(String[] args) {
		College c = new College(23,"Beast");
		Students s = new Students(1234,"Computer Science",c);
		s.display();

	}

}
