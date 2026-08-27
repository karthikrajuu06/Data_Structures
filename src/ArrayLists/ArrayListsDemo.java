package ArrayLists;

import java.util.*;

public class ArrayListsDemo {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList <>();
		
		// ArrayList li = new ArrayList();
		
		li.add(9);
		li.add(10);
		li.add(12);
		li.add(22);
		li.add(24);
		li.add(25);
		
	//	li.add("karthik");
	// li.add("rajuuu");
		
		System.out.println(li);
		System.out.println(li.get(0));
		System.out.println(li.equals(li));
		System.out.println(li.indexOf(22));
		System.out.println(li.size());
		System.out.println(li.isEmpty());
		System.out.println(li.set(5, 99));
		
		
	}

}
