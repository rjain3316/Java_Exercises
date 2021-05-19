import java.util.Scanner;

public class JavaPractice4 {

	public static void main(String[] args) {

		//Write a method to check prime no. in Java?
		
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter any number :");
		int n=s.nextInt();
		System.out.println("The number you have entered is = "+n);
		
		if(n<=1)
		{
			System.out.println("Number is not prime");
		}
		else if((n!=2 || n!=3)&&((n%2==0)||(n%3==0)))
		{
			System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}

}
