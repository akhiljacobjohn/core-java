package core;

public interface InEx2 {
	

	String getBrand();
	
	int getNum();
	
	
	default String getStr() {
		
		return "Hey I am from getStr method";
		
	}
	
	default String getNumAgain() {
		
		return "Hey, Getting number again";
	}
	

}
