package Qn2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	public static void main(String[] args) {

	    try {
	      FileInputStream source = new FileInputStream("E:\\Srm_Tasks\\briyanispots.txt");
	      FileOutputStream destination = new FileOutputStream("E:\\Srm_Tasks\\briyanispotsCopy.txt");
	        int b;
	        while  ((b=source.read()) != -1)
	            destination.write(b);
	     System.out.println("The Source file is copied to destination successfully...");
	      source.close();
	      destination.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
	}
