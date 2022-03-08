package core;

public class EagerSingleton {
	
	private static EagerSingleton singleton_instance = new EagerSingleton();
	
	String r = "hi";
	
	private EagerSingleton() {
	//	System.out.println("Inside The constructor of a Singleton class");
	}
	
	
	private static EagerSingleton getInstance() {
		//System.out.println("Return Singleton Object");
		
		return singleton_instance;
	}
	
	
	
	public static void main(String[] args) {
		
		EagerSingleton s = getInstance();
		
		EagerSingleton t = getInstance();
		
		s.r = "hello";
		
		System.out.println("Check : t.r value changed? " + t.r);
		
		
	}
	
	
	

}
