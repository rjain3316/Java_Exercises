import java.util.Scanner;

public class JavaPractice1 {

	public static void main(String[] args) {

		//Write a function to reverse a number in Java?
		
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("your entered number is = "+num);
		
		int flag=0;
		while(num!=0)
		{
			flag=flag*10+num%10;
			num=num/10;
		}
		
		System.out.println("Reserved number is = "+flag);
	}

}
