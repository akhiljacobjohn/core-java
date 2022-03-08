package core;

public interface InEx {
	

	
	//Constant
	public static int STR = 1;
	
	String getBrand();
	
	int getNum();
	
	
	
	default String getStr() {
		
		return "Hey I am from getStr method";
		
	}
	
	default String getNumAgain() {
		
		return "Hey, Getting number again";
	}
	


}
