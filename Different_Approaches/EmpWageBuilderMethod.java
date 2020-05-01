/*
*Employee Wage Computation Program by Creating Instance
*@author Abhishek Agarwal
*/

//Employee Wage Class 

public class EmpWageBuilderMethod
{
		//Constants
		public static final int IS_FULL_TIME =1;
                public static final int IS_PART_TIME =2;

                private final String Company;
                private final int empRatePerHour ;
                private final int numOfWorkingDays ;
                private final int maxHoursPerMonth ;
		
		//Constructor
		EmpWageBuilderMethod(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
		
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		
		}

		//Instance Method for calculating the Employee wage 

		private int computeEmpWage()
		{
	
			//variables
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			//Computation
			while( day < numOfWorkingDays || TotalWorkingHours <= maxHoursPerMonth)
			//for (int day =0;day<NUM_OF_WORKING_DAYS;day++)
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
				empWage = empHrs * empRatePerHour;
				TotalEmpWage+=empWage;
			}	
			//System.out.println("Total Emp wage :"+ TotalEmpWage);
			return TotalEmpWage;	
		
		}

		public static void main(String[] args)
		{	
			//Declaring instance for Google and dMart
			EmpWageBuilderMethod dMart = new EmpWageBuilderMethod("Dmart",20,20,100);
			EmpWageBuilderMethod Google = new EmpWageBuilderMethod("Google",30,20,80);
			System.out.println("Total Emp wage :"+ Google.computeEmpWage());
			System.out.println("Total Emp wage :"+ dMart.computeEmpWage());
		}	

	
}
