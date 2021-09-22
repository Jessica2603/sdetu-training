package basico;

public class SalaryCalculator {
	public static void main (String[] args) {
	//Vamos criar uma variavel para definir nossa carreira
		
		//Declarar Variave/
		String career;
		System.out.println("Program is starting");
		
		//Definição de variavel
		career = "Software Developer";
		System.out.println("My career:" + career);
		
		//Declaração e Definição
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My Salary as a "  + career + "at the rate of $" + rate + "per hour is $" + salary + "per year" );
		
		//Computer our anual Salary
		//rate*hourPerWeek * weeksPerYou

	}

}
