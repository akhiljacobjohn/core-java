package core;

public class NestedClassEx {

	{
		num = 6;
		name = "Akhil";
	}
	
	private int num;
	private String name;
	
	
	 int i = 5;
	
	//This is an Inner Class
	 class NestedClass{
		
		
	}
	
	//This is a static nested class
	 static class NestedStaticClass{
		 
		int method() {
			NestedClassEx nx = new NestedClassEx();
			return nx.i;
		}
		
	}
	 
	 
	 public static void main(String[] args) {
		 
		 NestedClassEx e = new NestedClassEx();
		 System.out.println(e.num);
		 
			
		}

}
