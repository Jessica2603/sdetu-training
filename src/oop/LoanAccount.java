package oop;

public class LoanAccount implements I {

	@Override
	public void setRate() {
		System.out.println("Rate");		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Seting the term to:" + term + "years.");
	}
	
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
	}
	
}


// agora vamos realmente passar pelo processo de criação de um objeto