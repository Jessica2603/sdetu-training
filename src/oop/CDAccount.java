package oop;

public class CDAccount extends BankAccount implements I {

	String interestRate;
	
	void compount() {
		System.out.println("Compounding interest");
	}
}
