package serialization;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;

public class DeserializationUtil {

	public static Book deserializeStrToObj(String serializedStr) {

		byte[] data = Base64.getDecoder().decode(serializedStr);

		Book bk = null;
		try {
			ByteArrayInputStream bais = new ByteArrayInputStream(data);
			ObjectInputStream ois = new ObjectInputStream(bais);
			bk = (Book) ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Deserialization Completed");

		return bk;

	}

	public static void main(String[] args) {

	}

}
