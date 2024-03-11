package String_Operations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any String-: ");
		String str=sc.nextLine();
		
		str=str.replaceAll(" ", "");
		str=str.toLowerCase();
		char [] ch=str.toCharArray();
		int cnt=0;
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++)
		{
			cnt=0;
			for(int j=0;j<ch.length;j++)
			{
				 if(ch[i]==ch[j])
				 {
					 cnt++;
				 }
			}
			
			map.put(ch[i], cnt);
		}
		
		System.out.println(map);
		
	}

}
