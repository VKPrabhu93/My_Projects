package multipleinheritance;

public class RuleInIndia implements Traffic_light,Red_Light{

	public void display_timeout() {
		
		System.out.println("Time out should be displayed");
	}
	public static void main(String[] args) {
		RuleInIndia rii = new RuleInIndia();
		rii.display_timeout();
		rii.stoppinglight_red();
		rii.zebraline();
		rii.yellowlight();
		

	}

	@Override
	public void stoppinglight_red() {
		System.out.println("Red is to stop");
		
	}

	@Override
	public void yellowlight() {
		System.out.println("Yellow is to wait");
		
	}

	@Override
	public void zebraline() {
		System.out.println("Zebra line is for crossing");
		
	}

}
