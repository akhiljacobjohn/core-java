package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomException {

	String filename = "package-inf.java";

	public String exceptionExample() throws Exception {

		try (Scanner file = new Scanner(new File("package-info.java"))) {
			if (file.hasNextLine())
				System.out.println("File has next line");
				return file.nextLine();
		} catch (FileNotFoundException err) {
			System.out.println("Inside Catch block");
			if (filename != "package-info.java") {
				System.out.println("He");
				throw new IncorrectFileName("Incorrect filename : " + filename, err);
			}

		}
		return "Hello";
	}

	public static void main(String[] args) throws Exception {
		
		CustomException ce = new CustomException();
		String firstline = ce.exceptionExample();
		System.out.println(firstline);

	}

}
