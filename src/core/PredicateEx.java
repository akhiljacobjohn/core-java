package core;

import java.util.function.Predicate;

public class PredicateEx{
//
//	@Override
//	public boolean test(String str) {
//		return str != null;
//	}
//	
	
	public static void main(String[] args) {
		Predicate<String> st = (val) -> val != null;
		System.out.println(st.test("test"));
		System.out.println(st.test(null));
//		Predicate<String> st = new PredicateEx();
//		System.out.println("test");
//		System.out.println(st.test(null));
	}

}
