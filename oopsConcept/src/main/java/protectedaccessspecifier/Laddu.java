package protectedaccessspecifier;

public class Laddu extends Bakery{

	public static void main(String[] args) {
		Laddu l = new Laddu();
		l.pricetag(500);
		
		Bakery bl = new Bakery();
		bl.pricetag(788);

	}

}
