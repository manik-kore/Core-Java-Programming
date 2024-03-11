package String_Operations;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Approach 1
		
		String s="Programming";
		
		StringBuilder sb1 = new StringBuilder();
		
		s.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		
		// Approach 2
		
		StringBuilder sb2 = new StringBuilder();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int index=s.indexOf(ch, i+1);
			
			if(index==-1)
			{
				sb2.append(ch);
			}
		}
		
		System.out.println(sb2);
		
	}

}
