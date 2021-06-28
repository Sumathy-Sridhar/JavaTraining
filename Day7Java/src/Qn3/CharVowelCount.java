package Qn3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CharVowelCount {

	public static void main(String[] args) throws Exception {
	      File f1=new File("E:\\Srm_Tasks\\briyanispots.txt"); 
	      String[] words=null;   
	      FileReader fr = new FileReader(f1);  
	      BufferedReader br = new BufferedReader(fr); 
	      String s;
	      int flag,Vowels=0,conso=0,wordcount=0;
	      while((s=br.readLine())!=null)
	      {
	         words=s.split(" "); 
	         wordcount+=words.length;
	         for(int i=0;i<words.length;i++)
	         {
	            for(int j=0;j<words[i].length();j++)
	            {
	               char ch=words[i].charAt(j);   
	               if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')   //Checking for vowels
	               {
	                      flag=1; 
	                      Vowels=Vowels+1;
	                      System.out.println("Vowel Encountered: " +ch);
	                }
	               else{
	            	   flag=0;
	            	   conso=conso+1;
	            	   System.out.println("Consonant Encountered : "+ch);
	               }
	            }
	              }
	      }
	      
	      System.out.println("Total Count of Vowels in the File:  "+Vowels);
	      System.out.println("Total Count of Consonants in the File: " +conso);
	      System.out.println("Total Characters in the File : " +(wordcount-1));   
	}
	}
	    		  