import java.util.Scanner;

public class FizzBuzz
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int totalNumber, nowNumber, capsLock=1;
		
		System.out.println("Please enter a positive integer.");
		totalNumber = in.nextInt(); //get the number we need to count
		
		while(totalNumber<1)
		{
			System.out.println("Input should be a positive integer."); //if input<1, user needs to enter again until input>=1
			totalNumber = in.nextInt();
		}
		
		in.close(); //close Scanner
		
		for(nowNumber=1; nowNumber<=totalNumber; nowNumber++) //start to count
		{
			if(nowNumber%35==0) //if number is divisible by 5 and 7
			{
				if(capsLock==1) //if capsLock=1, then print "fizzbuzz", and change capsLock to 0
				{
					System.out.print("fizzbuzz ");
					capsLock=0;
				}
				else //if capsLock=0, then print "Fizzbuzz", and change capsLock to 1
				{
					System.out.print("Fizzbuzz ");
					capsLock=1;
				}
			}
			else if(nowNumber%5==0) //if number is divisible by 5 but not divisible by 7
			{
				if(capsLock==1) //if capsLock=1, then print "fizz", and change capsLock to 0
				{
					System.out.print("fizz ");
					capsLock=0;
				}
				else //if capsLock=0, then print "Fizz", and change capsLock to 1
				{
					System.out.print("Fizz ");
					capsLock=1;
				}
			}
			else if(nowNumber%7==0) //if number is divisible by 7 but not divisible by 5
			{
				if(capsLock==1) //if capsLock=1, then print "buzz", and change capsLock to 0
				{
					System.out.print("buzz ");
					capsLock=0;
				}
				else //if capsLock=0, then print "Buzz", and change capsLock to 1
				{
					System.out.print("Buzz ");
					capsLock=1;
				}
			}
			else System.out.print(nowNumber + " "); //if number is not divisible by 5 and 7, then print the number
		}
	}
}
