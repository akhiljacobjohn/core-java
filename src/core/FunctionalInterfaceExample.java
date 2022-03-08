package core;

public interface FunctionalInterfaceExample {

	public void execute();

	public default void printmsg() {
		System.out.println("Printing a sample message");
	}

	public static void printanothermsg() {
		System.out.println("Printing another sample message");
	}

}
