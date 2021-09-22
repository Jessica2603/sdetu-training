package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		// Creating a new bank account >> this instantiate as object
		
		// crio uma classe e um objeto da classe ele vai chamar construtor
         // esta vazio ele chamara assim que for criado o objeto
		
		BankAccount acc1 = new BankAccount();
		// Aula 18. Palavra-Chave estática e final. 
		
		// acc1.name = "Jessica Pio";
		// With Encapsulation: public API methods
		acc1.setName("Jessica Pio");
		System.out.println(acc1);
		acc1.setSsn("2348234432");
		System.out.println("SSN: " + acc1.getSsn());

		
		
		acc1.accountNumber = "01609453";
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		//despois de cada vez que eu chamar esse método. Vamos chamar essa transação de atividade show, mostrar equilibrio de atividade, e isso é util porque nós
		
		acc1.deposit(1500);
		
		//acc1.deposit(1500);
		//acc1.deposit(1500);
		//acc1.withdraw(2000);
		
		// Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		// e assim quando eu criar o objeto, quando criar este objeto, isso não chamará o padrão
		// Polimorphism through overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "01609453";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "01609453";
		acc3.checkBalance();
		
		
		/*
		// se eu acrescentar 5000 apos "saving account", 5000 ele ira imprimir outra linha 
		//BankAccount acc3 = new BankAccount("Savings Account",5000);
		
		//System.out.println(acc1.routingNumber);
		//System.out.println(acc2.routingNumber);
	    //System.out.println(acc3.routingNumber);
	
	
	    // Demo for inheritance
	    CDAccount cd1 = new CDAccount();
	    cd1.balance = 3000;
	    cd1.interestRate = "4.5";
	    cd1.name = "Juan";
	    cd1.accountType = "CD Account";
	    System.out.println(cd1.toString());
		cd1.compount();
	*/
	
	}
	

}
