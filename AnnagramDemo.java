package String_Operations;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramDemo {

	public static String isAnnagram(String s1, String s2)
	{
		 s1=s1.replaceAll(" ", "");
		 s2=s2.replaceAll(" ", "");
		 
		 if(s1.length()!=s2.length())
		 {
			 return "Strings are not equal length";
		 }
		 else
		 {
			 char [] a1=s1.toLowerCase().toCharArray();
			 char []a2=s2.toLowerCase().toCharArray();
			 
			 Arrays.sort(a1);
			 Arrays.sort(a2);
			 
			 if(Arrays.equals(a1, a2))
			 {
				 return "Annagram";
			 }
			 else
			 {
				 return "Not Annagram";
			 }
		 }
		 
		 
		
		  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		 System.out.println("Enter String One");
		 Scanner sc=new Scanner(System.in);
		 String str1=sc.next();
		 System.out.println("Enter String Two");
		 String str2=sc.next();
		 System.out.println(isAnnagram(str1, str2));
		 
		 
		 
	}

}
