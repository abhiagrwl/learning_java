/*
*Employee Wage Computation Program by OOP Approach
*@author Abhishek Agarwal
*/

//Employee Wage Class 

public class EmpWageBuilderObject
{
		/**
		 *  Constants
		 */
		public static final int IS_FULL_TIME =1;
                public static final int IS_PART_TIME =2;

                private final String Company;
                private final int empRatePerHour ;
                private final int numOfWorkingDays ;
                private final int maxHoursPerMonth ;

		EmpWageBuilderObject(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
		
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		
		}

		public static void main(String[] args)
		{	
	
			EmpWageBuilderObject dMart = new EmpWageBuilderObject("Dmart",20,20,100);
			/**
			 *  Variables
			 */
			
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			/**
			 *  Computation
			 */
			while( day < dMart.numOfWorkingDays || TotalWorkingHours <= dMart.maxHoursPerMonth)
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
				empWage = empHrs * dMart.empRatePerHour;
				TotalEmpWage+=empWage;
			}	
			System.out.println("Total Emp wage :"+ TotalEmpWage);
		}	

	
}
