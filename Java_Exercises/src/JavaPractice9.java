
public class JavaPractice9 {

	public static void main(String[] args) {
		
		// printing multi dimension array
		
		int a[][]= {{2,4,5},{3,4,7}};
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}

	}

}
