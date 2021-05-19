
public class Reverse_demo {

	public static void main(String[] args) {


		String s="roopal";
		String t="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			t= t +s.charAt(i);
		}

		System.out.println(t);
		if(s.equalsIgnoreCase(t))
		{
			System.out.println("the string is a palindrome");
		}
		else
		{
			System.out.println("the string is not a palindrome");
		}
	}

}
