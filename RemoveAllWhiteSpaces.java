package String_Operations;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str="  J  a  va s t   a r   ";
		
	//	String plainString=str.replaceAll("[^a-zA-Z0-9]", "");
		String plainString=str.replaceAll("\\s", "");
		
		System.out.println(plainString);

		

	}

}
