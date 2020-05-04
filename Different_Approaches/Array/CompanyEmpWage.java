
public class CompanyEmpWage
{
                //Constants
                public final String company;
                public final int empRatePerHour ;
                public final int numOfWorkingDays ;
                public final int maxHoursPerMonth ;
                public int totalEmpWage;


                //Constructor Initialiaing the parameters
                public CompanyEmpWage(String Company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
                {

                        this.company = Company;
                        this.empRatePerHour = empRatePerHour;
                        this.numOfWorkingDays = numOfWorkingDays;
                        this.maxHoursPerMonth = maxHoursPerMonth;

                }

                public void setTotalEmpWage(int totalEmpWage)
                {
                        this.totalEmpWage =totalEmpWage;
                }

                @Override
                public String toString()
                {
                return "total emp wage for company "+ company + "is" + totalEmpWage;

                }
}

