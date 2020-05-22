public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
				int IS_FULL_TIME =1;
				double empCheck = Math.floor(Math.random() * 10) %2;
				if (empCheck == IS_FULL_TIME)
						System.out.println("Employee is Present");
				else
						System.out.println("Employee is Absent");
	int WagePerHr = 20, FullDayHrs = 8;
	int DailyEmployeeWage;
	DailyEmployeeWage = WagePerHr * FullDayHrs;
	System.out.println("DailyEmployeeWage" +DailyEmployeeWage);
		int PartTimeHrs = 4;
		DailyEmployeeWage = WagePerHr * PartTimeHrs;
		System.out.println("DailyEmployeeWage" +DailyEmployeeWage);
		}
	}	
