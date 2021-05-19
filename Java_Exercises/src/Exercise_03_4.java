import java.util.Scanner;

//4: Ask user to enter a number and then print the factorial of the input number.
//example if user input 5, then print "factorial of 5 is = 120" i.e.  5*4*3*2*1

public class Exercise_03_4 {

	public static void main(String[] args) {
		
		int temp=1;
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		System.out.println("entered number is = "+num);
		for(int i=num; i>0; i--)
		{
			temp=i*temp;
		}
		System.out.println("Factorial of the entered number is = "+temp);
	}

}
