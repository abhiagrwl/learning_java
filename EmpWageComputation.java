import java.util.Random;
class Employee{
	int salary;
	int attendance;

	public int get_salary(int attendance)
	{
		int WagePrHr=20;
		int DayPrHr;
		this.attendance = attendance;
		if(this.attendance==0){
			System.out.println("Employee Present");
			DayPrHr=8;
		}
		else{
			System.out.println("Employee Absent");
			DayPrHr=0;
		}
		salary=WagePrHr*DayPrHr;
		return salary;
	}

}
class EmpWageComputation{
   public static void main(String []s){
		int attend;
		int DailyWage;
                System.out.println("Welcome to Employee Wage Computation Program");
		Employee person = new Employee();
		Random rand = new Random();
		attend = rand.nextInt(2);
		DailyWage = person.get_salary(attend);
		System.out.println("The Daily wage is: "+DailyWage);
   }
}
