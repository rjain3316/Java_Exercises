
public class Interview_maxNumber {

	public static void main(String[] args) {
		
		//print max number from that column from which we will get minimum number of the matrix
		
		int a[][]= {{2,4,5},{3,10,7},{11,2,0}};
		int min=a[0][0];
		int minColumn=0;
		int max=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
					minColumn=j;
				}
			}
		}
		System.out.println("minimum value of the matrix is = "+min);
		System.out.println(minColumn);
		
		/*for(int k=0;k<3;k++)
		{
			for(int l=minColumn;l<=minColumn;l++)
			{
				if(a[k][l]>max)
				{
					max=a[k][l];
				}
			}
		}*/
		int k=0;
		while(k<3)
		{
			if(a[k][minColumn]>max)
			{
				max=a[k][minColumn];
			}
			k++;
		}
		System.out.println("max value of min value column is = "+max);
	}

}
