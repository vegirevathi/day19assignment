public class EmpWageBuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int WagePerHr=20, PartTimeHrs=4, FullDayHrs=8;
		int DailyEmployeeWage;
		int empCheck = (int)(Math.random() * 10) %2;
		switch (empCheck) {
		case 1:
			System.out.println("daily Employee Wage for Full Time");
			DailyEmployeeWage=WagePerHr*FullDayHrs;
			break;
		case 2:
			System.out.println("Daily Employee Wage for Part Time");
			DailyEmployeeWage=WagePerHr*PartTimeHrs;
			break;
		default :
			System.out.println("Employee is absent");
			DailyEmployeeWage=0;
			break;
		}
		System.out.println("DailyEmployeeWage" +DailyEmployeeWage);
	}	
}
