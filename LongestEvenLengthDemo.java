package String_Operations;

public class LongestEvenLengthDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Hi Good Morning To All Of You";
		
		str=str+" ";
		System.out.println(str);
		String word="", longest="";
		for(int i=0;i<str.length();i++) {
			
			 char ch=str.charAt(i);
			 
			 if(ch!=' ')
			 {
				 word=word+ch;
			 }
			 else
			 {
				  if(word.length()>longest.length())
				  {
					  longest=word;
				  }
				  
				  word="";
			 }
			 
			 
		}
		
		System.out.println(longest);

	}

}
