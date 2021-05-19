
public class JavaPractice5 {

	public static void main(String[] args) {

		int t=1;
		for(int i=0;i<4;i++)
		{
			for(int j=i+1;j<=4;j++)
			{
				System.out.print(t+i);
				t++;
				System.out.print("\t");
			}
			System.out.print("\n");
			t--;
		}
	}

}
