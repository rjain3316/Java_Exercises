import java.util.Scanner;

public class JavaPractice3 {

	public static void main(String[] args) {

		// Write Java code to identify a number as Palindrome (121) ?
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter a number :");
		int n=s.nextInt();
		System.out.println("The number you have entered is = "+n);
		int num=n;
		int count=0;
		while(n>0)
		{
			count=count*10+n%10;
			n=n/10;
		}
		System.out.println(count);
		if(count==num)
		{
			System.out.println("Entered number is a palindrome number");
		}
		else
		{
			System.out.println("Entered number is not a palindrome number");
		}
	}

}
