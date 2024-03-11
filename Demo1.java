package String_Operations;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("You cannot change me");
		String s2 = new String("You cannot change me");
		String s3 = "You cannot change me";
		String s4 = "You cannot change me";
		String s5 = "You cannot "+"change me";
		String s6 = "You cannot "; // s6 is a normal variable
		String s7 = s6+"cahange me"; // s6 is a normal variable so that the operation(+) will be performed at run time and 
		                             // A new object will be created in heap area.
  final	String s8 = "You cannot ";
        String s9 = s8+"change me";
		
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s1==s7);
		System.out.println(s3==s9);
		
		// Internig Method In String
		
     //  By using heap object reference if we want to get corresponding scp object then use intern() method in string.		
  
		String str1 = new String("Java");
		String str2 = str1.intern();
		String str3 = "Java";
		System.out.println(str2==str3);
		
		
     //  		
		
		

	}

}
