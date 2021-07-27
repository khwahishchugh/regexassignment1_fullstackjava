import java.util.*;
class GrossSalary
{
	public static void main(String[] args) 
	{
		float salary,hra,da,pf,ta;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Basic Salary in INR");
		salary=s.nextFloat();
		System.out.println("Enter HRA in percentage");
		hra=s.nextFloat();
		hra=(hra/100)*salary;
		System.out.println("Enter DA in percentage");
		da=s.nextFloat();
		da=(da/100)*salary;
		System.out.println("Enter TA in percentage");
		ta=s.nextFloat();
		ta=(ta/100)*salary;
		System.out.println("Enter PF in percentage");
		pf=s.nextFloat();
		pf=(pf/100)*salary;
		float grossSalary;
		grossSalary=salary+hra+da+ta-pf;
		System.out.println("The Gross Salary thus will be :"+grossSalary);
	}
}
