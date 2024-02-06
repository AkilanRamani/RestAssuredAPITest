package TestAutomation;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataWritingStream {

	public static void main(String[] args) throws IOException {
		 FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        //Writes an int to the underlying output stream as fourbytes, high byte first. If no exception is thrown, the counter written is incremented by 4.

	        data.writeInt(65);  
	        data.flush(); // it forces the data to be written on to the Output Stream. 
	        data.close();  
	        System.out.println("Succcess...");  
	    }  
	 

	}


