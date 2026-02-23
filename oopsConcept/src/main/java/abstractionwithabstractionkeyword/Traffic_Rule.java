package abstractionwithabstractionkeyword;

public abstract class Traffic_Rule {

	public void lightrule() {
		
		System.out.println("Light should be displayed. This is in Traffic_Rule");
	}
	public abstract void redlightrule();
	public abstract void greenlight();
	public abstract void yellowlight();
	
}
