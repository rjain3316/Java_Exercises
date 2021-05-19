
public class Interview_arraySorting {

	public static void main(String[] args) {
		
		int arr[]= {7,13,4,9,11,0,16};
		int temp=0;
		//To sort array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					//swap with variable
					/*temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;*/
					//Swapping without a variable
					arr[i]=arr[i]+arr[j];
					arr[j]=arr[i]-arr[j];
					arr[i]=arr[i]-arr[j];
				}
			}
		}
		System.out.println("Array after sorting :");
		//To print array value after sorting
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
			System.out.print("\t");
		}

	}

}
