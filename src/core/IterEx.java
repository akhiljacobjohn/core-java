package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterEx {

	
	
	
	public static void main(String[] args) {
		

		List<String> lst = new ArrayList<String>();
		
		
		
		lst.add("H");
		lst.add("E");
		lst.add("L");
		lst.add("L");
		lst.add("O");
		
		Iterator<String> iter = lst.iterator();
		
		while(iter.hasNext()) {
			iter.forEachRemaining(System.out::println);
		}
	}
	
	
	
}
