package serialization;

import java.io.Serializable;

public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5563978343130082121L;

	private String title;
	transient private String author;
	private double price;

	public Book() {
	};

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {

		Book book = new Book();
		book.setAuthor("Yuval Harari");
		book.setTitle("Sapiens");
		book.setPrice(450);

		try {
			String serializedStr = SerializationUtil.serializeObjtoStr(book);
			System.out.println(serializedStr);
			Book debook = DeserializationUtil.deserializeStrToObj(serializedStr);
			System.out.println(debook.title);
			System.out.println(debook.author);
			System.out.println(debook.price);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
