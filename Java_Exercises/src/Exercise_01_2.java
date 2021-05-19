
public class Exercise_01_2 {

	public static void main(String[] args) {
		
		//2: Print HELLO in CAPITAL letters for the given string "ahceclwlxo"
		String s="ahceclwlxo";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if((i+1)%2==0)
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t.toUpperCase());

	}

}
