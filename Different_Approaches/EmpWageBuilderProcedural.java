/*
*Employee Wage Computation Program by Procedural Approach
*@author Abhishek Agarwal
*/

//Employee Wage Class 
public class EmpWageBuilderProcedural
{
		//Constants
		public static final int IS_FULL_TIME =1;
		public static final int IS_PART_TIME =2;
		public static final int EMP_RATE_PER_HOUR =20;
		public static final int numOfDays =20;
	

		//Method for calculating the Employee wage 
		public static int calcEmpWageForCompany(String Company,int empRate,int numOfDays,int maxhrs)
		{
	
	
			//variables
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			//Computation
			while( day < numOfDays || TotalWorkingHours < 100)
			//for (int day =0;day<numOfDays;day++)
			{	
				double empCheck = Math.floor(Math.random() * 10 % 3 );
				day++;
				switch ((int)empCheck)
				{
					case IS_FULL_TIME:
						empHrs=8;
						break;
					case IS_PART_TIME:
						empHrs=4;
						break;	
					default:
						empHrs =0;	
				
				}
			TotalWorkingHours+=empHrs;	
			empWage = empHrs * empRate;
			TotalEmpWage+=empWage;
			}	
			System.out.println("Total Emp wage for company is :"+Company + " " + TotalEmpWage);
			return TotalEmpWage;
	
		}

		public static void main(String[] args)
		{	
			//Declaring instance for Google
			calcEmpWageForCompany("Google",20,2,10);
			//Declaring instance for AMEX
			calcEmpWageForCompany("AMEX",10,20,8);
		}	

	
}
