package threads;

public class ThreadEx extends Thread{
	
	
	 public void run(){
	       System.out.println("MyThread running");
	    }
	 
//
	public static void main(String[] args) {
//	
//		Thread thread = new Thread();
//		thread.start();
		

//		Thread thread = new Thread() {
//			public void run() {
//				System.out.println("Runnin Thread");
//			}
//		};
//		
		ThreadEx thread = new ThreadEx();
		
		thread.start();
		
	}

}
