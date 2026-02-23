package abstractionwithabstractionkeyword;

public class Red_Light extends Traffic_Rule{

	public void display() {
		System.out.println("Display timeout");
	}
	public static void main(String[] args) {
		Red_Light rl = new Red_Light();
		rl.display();
		rl.redlightrule();
		rl.greenlight();
		rl.yellowlight();
		rl.lightrule();

	}

	@Override
	public void redlightrule() {
		System.out.println("Red light should be displayed");
	}

	@Override
	public void greenlight() {
		System.out.println("Green Light should be displayed");
		
	}

	@Override
	public void yellowlight() {
		System.out.println("Yellow Light should be displayed");
		
	}

}
