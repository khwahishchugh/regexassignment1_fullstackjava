import java.util.*;
class MinMax
{
	public static void main(String[] args)
	{
		int a,b,c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a=s.nextInt();
		int max=a,min=a;
		System.out.println("Enter 2nd Number");
		b=s.nextInt();
		if(max<b)
			max=b;
		if(min>b)
			min=b;
		System.out.println("Enter 3rd Number");
		c=s.nextInt();
		if(max<c)
			max=c;
		if(min>c)
			min=c;
		System.out.println("Enter 4th Number");
		d=s.nextInt();
		if(max<d)
			max=d;
		if(min>c)
			min=c;
		

		System.out.println("the numbers are : "+a+", "+b+", "+c+", "+d+" the max is "+max+" and the min is "+min);
	}
}
/*
  *************alternate approach****************
  AFTER TAKING OUTPUT AT ONCE
		int max=a,min=a;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
					max=a;
				else
					max=d;
			}
			else
			{
				if(c>d)
					max=c;
				else
					max=d;
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
					max=b;
				else
					max=d;
			}
			else
			{
				if(c>d)
					max=c;
				else
					max=d;
			}
		}
		//for min
		if(a<b)
		{
			if(a<c)
			{
				if(a<d)
					min=a;
				else
					min=d;
			}
			else
			{
				if(c<d)
					min=c;
				else
					min=d;
			}
		}
		else
		{
			if(b<c)
			{
				if(b<d)
					min=b;
				else
					min=d;
			}
			else
			{
				if(c<d)
					min=c;
				else
					min=d;
			}
		}
		*/
