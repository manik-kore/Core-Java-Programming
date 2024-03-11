package String_Operations;

import java.util.Arrays;

public class SameCharacters {
	
	public static String isAnnagram(String s1,String s2)
	{
		String str1=s1.replace("\\s", "");
		String str2=s2.replace("\\s", "");
		
		if(str1.length()!=str2.length())
		{
			return "String length is not same";
		}
		else
		{
			char [] c1=str1.toLowerCase().toCharArray();
			char [] c2=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				return "Characters are same";
			}
			else
			{
				return "Characters are not same";
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isAnnagram("manik kore", "kore manik"));
		
		
		
		
	}

}
