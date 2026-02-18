package encapsulation;

public class School {

	private int studentid;
	private String name;
	
	public void setstudentdetail(int studentid, String name) {
		this.name=name;
		this.studentid = studentid;
		
	}
	
	public void getstudentdetail() {
		System.out.println("Student id is "+" "+ studentid);
		System.out.println("Student name is "+ " "+ name);
	}
	
}
