
public class Interview_ArrayMinNumber {

	public static void main(String[] args) {
		
		//Print smallest number in 2*3 matrix
		int a[][]= {{2,4,5},{6,1,8}};
		int i;
		int j = 0;
		int min=a[0][0];
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println(min);
		System.out.println("current i value is = "+i);
		System.out.println("current j value is = "+j);
	}

}
 