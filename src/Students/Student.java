package Students;

import Lab.BankAccount;

//import Lab.BankAccount;
//import Lab.IInterest;

public class Student {
	
	public static void main(String[] args) { 
		
		Student acc1 = new Student("465329974", 1000);
		Student acc2 = new Student("654129874", 2000);
		Student acc3 = new Student("321569756", 2500);	
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
        acc1.enroll(500);
        acc1.checkBalance(600);
        acc1.payBill(1000);
        acc1.toString();
        System.out.println(acc1.toString());
        
	}
	//enroll(), pay(), checkBalance(), toString(), showCourses()
	private Object balance;
	private String accountNumber;
}
		
		
			private static int ID = 1000;                        // Internal ID
		    private String accountNumber;  // ID + random 4-digit number + first 2 of SSN
			private String name;
			private String SSN;
			private double balance;
			

		
	private void setAccountNumber( ) {
			int random = (int)  (Math.random() * 100);
			//accountNumber = ID + 
			accountNumber = ID + "" + random + SSN.substring(0, 2);
			System.out.println("Your Account Number: " + accountNumber);
			
}
		public Student(String SSN, double initDeposit) {
			//System.out.println("New Account Created");
		    balance = initDeposit;
			this.SSN =SSN;
			ID++;
		    setAccountNumber();
		}
		
		
		public void setName(String name) {
			this.name = name;
			
		}
		public String getName() {
			return name;
		}
		
		public void pay(double amount) {
			balance = balance - amount;
			System.out.println("Pay : " + amount);
			showCourses();
		}
	
		
		
		public void showCourses() {
			System.out.println("Balance " + balance);
		}
		//public void accrueInterest() {

		
		@Override
		public String toString() {
			return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n"  + "[Balance " + balance + "]"; 
			
		}
		}
	    



		/*BankAccount acc1 = new BankAccount("465329974", 1000);
			BankAccount acc2 = new BankAccount("654129874", 2000);
			BankAccount acc3 = new BankAccount("321569756", 2500);	
		
			acc1.setName("Jim");
			System.out.println(acc1.getName());
	        acc1.makeDeposit(500);
	        acc1.makeDeposit(600);
	        acc1.payBill(1000);
	        acc1.accrue();
	        System.out.println(acc1.toString());
	        
		}

	}

	class BankAccount implements IInterest {
	
		// Constructor
		
*/