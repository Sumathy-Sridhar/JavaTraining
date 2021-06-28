package Qn4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ConvertLower {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\Srm_Tasks\\briyaniUpper.txt");
			BufferedReader br = new BufferedReader(fr);
			PrintWriter out = (new PrintWriter(new FileWriter("E:\\srm_tasks\\briyaniLower.txt")));
			String s = " ";
			while ((s = br.readLine()) != null) {
				out.write(s.toLowerCase() + "\n");
			}
			System.out.println("Contents of file converted to Lowercase successfully...");
			out.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
