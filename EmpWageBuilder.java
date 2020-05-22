public class EmpWageBuilde{
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int i, NumofWorkingHrs=100, totalWage=0, WagePerHr=20;
		for (i=0; i<= NumofWorkingHrs; i++)
		{
			totalWage = WagePerHr*i;
			 System.out.println("total wage " +totalWage);
		}
	}	
}
