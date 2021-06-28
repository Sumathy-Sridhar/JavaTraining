package Qn4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ConvertUpper {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\Srm_Tasks\\briyanispots.txt");
			BufferedReader br = new BufferedReader(fr);
			PrintWriter out = (new PrintWriter(new FileWriter("E:\\srm_tasks\\briyaniUpper.txt")));
			String s = " ";
			while ((s = br.readLine()) != null) {
				out.write(s.toUpperCase() + "\n");
			}
			System.out.println("Contents of file converted to uppercase successfully...");
			out.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
