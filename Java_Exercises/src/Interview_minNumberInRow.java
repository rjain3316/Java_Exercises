
public class Interview_minNumberInRow {

	public static void main(String[] args) {
		
		//print minimum number from each row in 3*3 matrix
		/* Matrix :-
		 5  11  2
		 3  4  7
		 1  0  2
		 */
		
		int arr[][]= {{5,11,2},{3,4,7},{1,0,2}};
		for(int i=0;i<3;i++)
		{
			int min=arr[i][0];
			for(int j=0;j<3;j++)
			{
				
				if(arr[i][j]<min)
				{
					min=arr[i][j];
				}
			}
			System.out.println("minimum value of index "+i+" row is= "+min);
		}

	}

}
