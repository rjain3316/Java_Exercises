
public class Reverse_String {

	public static void main(String[] args) {

		String s="hello";
		String t="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
