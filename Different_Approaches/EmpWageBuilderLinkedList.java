/*
*Employee Wage Computation Program by Array  Approach
*@author Abhishek Agarwal
*/

//Employee Wage Class 
//

public interface IComputeEmpWage
{
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth);
	public void computeEmpWage();
	public int getTotalWage(String company);

}

public class CompanyEmpWage
{
		//Constants
		public final String company;
                public final int empRatePerHour ;
                public final int numOfWorkingDays ;
                public final int maxHoursPerMonth ;
		public int totalEmpWage;

		public CompanyEmpWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
		
			this.Company = Company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
		
		}
		public EmpWageBuilderArray()
		{
			companyEmpWageArray = new CompanyEmmpWage[5];

		}

		private void addCompanyEmpWage(String company,int empRatePerHour,int numOfcompany)
                private final String Company;
                private final int empRatePerHour ;
                private final int numOfWorkingDays ;
                private final int maxHoursPerMonth ;

		EmpWageBuilderObject(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
		
			this.company = company;
			this.empRatePerHour = empRatePerHour;
			this.numOfWorkingDays = numOfWorkingDays;
			this.maxHoursPerMonth = maxHoursPerMonth;
			totalEmpWage = 0;
		
		}

		public void setTotalEmpWage(int totalEmpWage)
		{
			this.totalEmpWage =totalEmpWage;
		}

		@override
		public String toString()
		{
		return "total emp wage for company "+ company + "is" + totalEmpWage;

		}

		public class EmpWageBuilder implements IComputeEmpWage
		{
			
		
		public static final int IS_FULL_TIME =1;
                public static final int IS_PART_TIME =2;

		private int numOfCompany =0;
		private LinkedList<CompanyEmpWage> companyEmpWageList;
		private Map<String,CompanyEmpWage> companyToEmpWageMap;
		

		public EmpWageBuilder()
		{
		
			companyEmpWageList = new LinkedList<>();
			companyToEmpWageMap = new HashMap<>();
		
		}

		public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
		{
		
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOgWorkingDays,maxHoursPerMonth);
		companyEmpList.add(companyEmpWage);
		companyToEmpWageMap.put(company,companyEmpWage);

		}


		public void computeEmpWage()
		{
		
		for(int i =0;i<companyEmpWageList.size();i++)
		{
		CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
		}


		@override
		public int getTotalWage(String company)
		{
		return companyToEmpWageMap.get(company).totalEmpWage;
		}
		
		}






		}

		public static void main(String[] args)
		{	
	
			EmpWageBuilderObject dMart = new EmpWageBuilderObject("Dmart",20,20,100);
			//variables
			int empHrs =0;
			int empWage=0;
			int TotalEmpWage=0;
			int TotalWorkingHours=0;
			int day =0;
			//Computation
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
