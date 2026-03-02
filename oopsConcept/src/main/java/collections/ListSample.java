package collections;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {


		List<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(11);
		l.add(13);
		l.add(21);
		l.add(11);
		System.out.println(l);
		System.out.println("Element at 3rd position is "+ l.get(2));
		l.set(0, 51);
		System.out.println("Size of list is "+ l.size());
		System.out.println("To check if list is empty  "+l.isEmpty());
		l.remove(3);
		
		System.out.println("To check if 51 is in list or not  "+l.contains(51));
		
		System.out.println("Index position of 11 is "+ l.indexOf(11));
		
		System.out.println("Last undex position of 11 is "+ l.lastIndexOf(11));
		
		
		

	}

}
