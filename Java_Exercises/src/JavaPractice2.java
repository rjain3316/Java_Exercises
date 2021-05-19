import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JavaPractice2 {

	public static void main(String[] args) {

		//Write a Java program to find out the first two max values from an array?
		
		int[] arrlist= {4,2,6,8,1};
		
		//first approach 
		/*int temp=0;
		for(int i=0;i<arrlist.length-1;i++)
		{
			for(int j=i+1;j<arrlist.length;j++)
			{
				if(arrlist[i]>arrlist[j])
				{
					temp=arrlist[i];
					arrlist[i]=arrlist[j];
					arrlist[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arrlist));
		System.out.println("first two max value from array are = "+arrlist[arrlist.length-2]+","+arrlist[arrlist.length-1]);
		*/
		
		
		//Second approach
		int maxone=0, maxtwo=0;
		for(int n:arrlist)
		{
			if(maxone<n)
			{
				maxtwo=maxone;
				maxone=n;
			}
			else if(maxtwo<n)
			{
				maxtwo=n; 
			}
		}
		System.out.println("Two max values are = "+maxone+","+maxtwo);
	}

}
