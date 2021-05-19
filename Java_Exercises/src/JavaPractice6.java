
public class JavaPractice6 {

	public static void main(String[] args) {

		/*output:- 
		1
		23
		456
		78910
		*/
		int k=1;
		for(int i=4;i>=1;i--)
		{
			for(int j=4;j>=0+i;j--)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
	}

}
