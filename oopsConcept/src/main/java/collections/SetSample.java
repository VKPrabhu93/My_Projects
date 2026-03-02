package collections;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {
		Set <Integer> s = new HashSet<Integer>();
		Set <Integer> s1 = new HashSet<Integer>();
		
		s.add(12);
		s.add(15);
		s.add(21);
		s1.add(22);
		s1.add(30);
		s1.add(14);
		s1.add(12);
		
		System.out.println("Set s is "+s);
		System.out.println("Set s1 is "+s1);
		
		s.addAll(s1);
		
		System.out.println("After adding both sets "+s);
		
		System.out.println("Size of the set s is "+s.size());
		System.out.println("Size of the set s1 is "+s1.size());
		
		System.out.println("To  check if the set is empty "+s.isEmpty());
		
		System.out.println("To check if the set contains 15 "+s.contains(15));
		
		System.out.println("To check if all elements of s1 are in s "+s.containsAll(s1));
		
		s.remove(12);
		
		System.out.println("After removing 12 s is "+s);
		
		s.removeAll(s1);
		System.out.println("After removing s1 from s "+s);
		  
	}

}
