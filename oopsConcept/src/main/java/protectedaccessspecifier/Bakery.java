package protectedaccessspecifier;

public class Bakery {

	protected void pricetag(int price) {
		
		System.out.println("Price should be displayed"+" "+price);
	}
	public static void main(String[] args) {
		Bakery by = new Bakery();
		by.pricetag(100);
	}

}
