package test;
import java.nio.file.*;

public class GetUserPath {
	
	String userpath = System.getProperty("user.home");
	
	public static void main(String[] args) {
		GetUserPath u = new GetUserPath();
		System.out.println(u.userpath);
		
		
		Path p  = Paths.get(u.userpath);
		
		if(Files.notExists(p)) {
			System.out.println(" NotExists");
		}
	}

}
