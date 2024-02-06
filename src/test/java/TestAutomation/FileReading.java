package TestAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
		//String filepath = "D:\\abc.txt";
	//	File f = new File(filepath);
		
		FileInputStream stream = new FileInputStream("D:\\abc.txt");
	
		System.out.println(stream);;

	}

}
