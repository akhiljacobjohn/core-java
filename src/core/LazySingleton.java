package core;

public class LazySingleton {

	private static LazySingleton singleton_instance = null;
	String str = "Hi";

	private LazySingleton() {
		// super();
		// TODO Auto-generated constructor stub
	}

	private static LazySingleton getInstance() {

		if (singleton_instance == null) {

			singleton_instance = new LazySingleton();
		}

		return singleton_instance;

	}
	
	public static void main(String[] args) {
		
		LazySingleton s = getInstance();
		LazySingleton t = getInstance();
		System.out.println(s.hashCode());
		System.out.println(t.hashCode());
		
		
		s.str = "Hello";
		
		System.out.println("Check - Value of t.str changed? " + t.str);
		
		
	}

}
