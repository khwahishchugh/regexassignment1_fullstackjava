import java.util.*;
class SimpleInterest
{
	public static void main(String[] args) 
	{
		float principle,rate,time;
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER THE PRINCIPAL AMOUNT");
		principle=s.nextFloat();
		System.out.println("ENTER THE RATE OF INTEREST IN PERCENTAGE");
		rate=s.nextFloat();
		System.out.println("ENTER THE TIME IN YEARS");
		time=s.nextFloat();
		float result;
		result=(principle*rate*time)/100; // SI=(P*R*T)/100 //divide by 100 as r in % 
		System.out.println("Simple interest for principle "+principle+" where rate is "+rate+
			"% and time is "+time+" years is equal to "+result);
	}
}
