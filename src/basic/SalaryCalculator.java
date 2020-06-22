package basic;

public class SalaryCalculator {
	public static void main(String[]args) {
		String career;
		System.out.println("Programe is starting!");
		career= "Softwer Developer";
		System.out.println("My career is: "+ career);
		int hoursperweek= 40;
		int weeksperhour= 50;
		double 	rate= 42.50;
		
		double salary= hoursperweek * weeksperhour * rate;
		System.out.println("My salary is: "+salary);
	}
}
