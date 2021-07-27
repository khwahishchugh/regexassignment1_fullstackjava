import java.util.*;
class LeapYear
{
	public static void main(String[] args) 
	{
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		year=s.nextInt();
		if((year%400)==0)
		{
			if((year%4)==0 & (year%100)!=0)
				System.out.println("It is a Leap Year");
			else
				System.out.println("It is not a Leap Year");
		}
		else
			System.out.println("It is not a Leap Year");
	}
}
