package core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializableClass {
	
	
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fint = new FileInputStream("serializedObj/SerializableClass.txt");
			ObjectInputStream objIn = new ObjectInputStream(fint);
			
			SerializableClass obj = (SerializableClass)objIn.readObject();
			
			System.out.println("Printing values of de serialized Object");
			System.out.println(obj.getI());
			System.out.println(obj.getMsg());
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
