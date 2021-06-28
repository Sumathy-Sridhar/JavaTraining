package Qn1;

import java.io.*;

class FileExercise {
	public static void main(String args[]) throws Exception {
	File f=new File("E:\\Srm_Tasks\\briyanispots.txt");
	System.out.println("FileName: " +f.getName());
	boolean bool=false;
	bool=f.exists();
	if(bool) {
		System.out.println("File Exists: "+bool);
		  BufferedReader br = new BufferedReader(new FileReader(f));
		  String st;
		  System.out.println("Contents of the File: ");
		  while ((st = br.readLine()) != null)
		    System.out.println(st);
		  br.close();
	}
	else {
		System.out.println("File Exists: "+bool);
	}
	
	//System.out.println("Set File to Readable: "+f.setReadOnly());
	System.out.println("Check If File is Writable : " +f.canWrite());
	System.out.println("Check if File is Readble: " +f.canRead());
	System.out.println("Check if it is a File: " +f.isFile());
	System.out.println("Absolute Path of File:  "+f.getAbsolutePath());
	System.out.println("Lenght of File: "+f.length());

	
	}
	}