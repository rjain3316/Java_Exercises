import java.util.Scanner;

public class Exercise_02_2 {

	public static void main(String[] args) {
		
		//2: Ask user to enter a number and then print the multiplication table of the input number.
		int t=0;
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		/*for(int i=1;i<=10;i++)
		{
			t=t+num;
			System.out.println(t);
		}*/
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i*num);
		}
	}

}
