package test;

public class StaticEx implements TestEx{
	
	public void disp() 
	{
		System.out.println("Hey");
	}
	
	public static void disp2() {
	
		System.out.println("Hey2");
	}

	
	public static void main(String[] args) {

		StaticEx ex = new StaticEx();
		TestEx ex1 = new StaticEx();
	
	}
}
