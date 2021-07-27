import java.util.*;
class PercentageAndDivision
{
	public static void main(String[] args) 
	{
		float sub1,sub2,sub3,sub4,sub5;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter subject1 marks out of 100");
		sub1=s.nextFloat();
		System.out.println("Enter subject2 marks out of 100");
		sub2=s.nextFloat();
		System.out.println("Enter subject3 marks out of 100");
		sub3=s.nextFloat();
		System.out.println("Enter subject4 marks out of 100");
		sub4=s.nextFloat();
		System.out.println("Enter subject5 marks out of 100");
		sub5=s.nextFloat();
		percentage=(sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("Percentage is : "+percentage);
		if(percentage>=75.00)
			System.out.println("You get a Distinction");
		else if(percentage>=60.00)
			System.out.println("You get First division");
		else if(percentage>=50.00)
			System.out.println("You get a Second division");
		else if(percentage>=40.00)
			System.out.println("You get a Third division");
		else
			System.out.println("Fail");
	}
}
