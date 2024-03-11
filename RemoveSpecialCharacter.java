package String_Operations;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="$@ja*(Va!st%a)r";
		
		String plainString=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainString);

		
	}

}
