/*
*Employee Wage Computation Program by Array  Approach
*@author Abhishek Agarwal
*/

//Employee Wage Class 
//


public class EmpWageBuilderArray
{
	

	public static final int IS_FULL_TIME =1;
	public static final int IS_PART_TIME =2;

	private int numOfCompany =0;
	private CompanyEmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray()
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}


	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
	
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}


	private void computeEmpWage()
	{
	
		for(int i =0;i< numOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}


	}


	private int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
	
	
			//variables
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			//Computation
			while( day < companyEmpWage.numOfWorkingDays && TotalWorkingHours <= companyEmpWage.maxHoursPerMonth)
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
				TotalEmpWage+=empWage;
			}	
			return TotalWorkingHours * companyEmpWage.empRatePerHour;
	}	


	public static void main(String[] args)
	{
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Dmart",20,5,100);
		empWageBuilder.addCompanyEmpWage("Google",40,4,80);
		empWageBuilder.computeEmpWage();
		
	}
	}

	
