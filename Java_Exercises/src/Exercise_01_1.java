
public class Exercise_01_1 {

	public static void main(String[] args) {
		
		//1: Print HELLO for the given string "AHCECLWLXO"
		
		String s="AHCECLWLXO";
		String t="";
		
		for(int i=0; i<=s.length()-1; i++)
		{
			if((i+1)%2==0)
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t.toLowerCase());
	}


}
