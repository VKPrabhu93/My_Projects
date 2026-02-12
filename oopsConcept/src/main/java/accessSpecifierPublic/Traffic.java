package accessSpecifierPublic;

public class Traffic {

	public void display_light() {
		System.out.println("Traffic light will be displayed");
	}
	public static void main(String[] args) {
		
		Traffic t = new Traffic();
		t.display_light();

	}

}
