package core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableClass implements Serializable {

	private static final long serialVersionUID = 1L;

	private int i;
	private String msg;

	SerializableClass(int i, String msg) {
		this.setI(i);
		this.setMsg(msg);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	public static void main(String[] args) {
		SerializableClass obj = new SerializableClass(100,"hello");
		FileOutputStream fout = null;
		ObjectOutputStream objOut =null;
		try {
			 fout = new FileOutputStream("serializedObj/SerializableClass.txt");
			 objOut = new ObjectOutputStream(fout);
			objOut.writeObject(obj);
			objOut.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				objOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
