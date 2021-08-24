package serialization;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class SerializationUtil {
	
	
	public static String serializeObjtoStr(Serializable o) throws Exception{
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream os = new ObjectOutputStream(baos);
		os.writeObject(o);
		
		baos.close();
		os.close();
		
		System.out.println("Serialization Completed");
		
		return Base64.getEncoder().encodeToString(baos.toByteArray());
		
		//return baos.toString();
	}
	
	
	public static void main(String[] args) {
		Book book = new Book();
		try {
			String serializedStr = serializeObjtoStr(book);
			System.out.println(serializedStr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
