package oop;

public class BankAccount {
	// Define variables
		String accountNumber;
		
		// static >> pertence a classe, n�o a inst�ncia do objeto.Essa � a ideia, em seguida, 
		// final >> � como a nossa constante
		// static >> belongs to the CLASS not the object.
	    // final >> constant (often static fianl)
		//static final String routingNumber = "013546";
		private final String routingNumber = "013546";
		
		// Instance variables
		private String name;
		private String ssn;
		String accountType;
		double balance = 0;

		
		private String showActivity;

		
		// Constructor definition: unique methods
		   // 1. They are used to define / setup / initialize properties of an object
		   // 2. Constructors are IMPLICITLY called upon INSTANTIANTON
		   // 3. The same name as the class itself
	       // 4. Constructors have NO return type
		BankAccount(){
			System.out.println("NEW ACCOUNT CREATED");
		}
		//inicio do bloco
		// Overloading: call same method name with different arguments
		BankAccount(String accountType) {
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		BankAccount(String accountType, double initDeposit) {
			// initDeposit, accountType, Msg are all local variables
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("INITIAL DEPOSIT OF: $ " + initDeposit);
			String Msg = null;
			if (initDeposit < 1000) {
				 Msg = "ERRO: Minimus deposit must be at least $1,000";		
			}  else {
				 Msg = "Thanks for your initial deposit of:" + initDeposit;
			}
			System.out.println(Msg);
			balance = initDeposit;
		}
		// fim do bloco 
		
		// Getters / Setters
		
		
		// Allow the user to define the name
		public void setName(String name) {
			this.name = "Sra." + name;
		
		}
		public String getName( ) {
			return name;
			
		}
		
		
		public String getSsn() {
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		
		
		// Interface methods
		public void setRate() {
			System.out.println("SETING RATE");
		}
		public void increaseRate() {
			System.out.println("INCREASE RATE");
		}
		
		
		// Define Methods
		//void deposit( ) {
		//equilibrio = a equilibrio + quantidade, vamos ter certeza que estamos tormando uma quantidade dupla e ent�o n�s retiramos.
		// vamos pegar a mesma coisa, retirar-se duas vezes.
	   
		public void deposit(double amount, String showActivity) {
	    	balance = balance + amount;
	    	showActivity = ("DEPOSIT");
		}
	    // saldo = saldo + quantidade
		void withdraw(double amount) {
			balance = balance + amount;
			showActivity("WITHDRAW");
			
			// sendo assim ent�o vamos dizer que Show, dizer que isso requer uma atividade de String
			//vamos adicionar o m�todo chamado atividade de show privado, ent�o para cada vez, em outras palavras, cada vez que fizermos um deposito, n�s iremos chamar showActivity vamos dizer depo�sito
			// para retirarmos, vamos fazer o mesmo
			
		}
		   // Vamos dizer a sua trnasa��o recente e n�s iremos imprimir	
		   // Seu novo equilibrio � e ent�o concatena c�dulas, em outras palavras cada vez que retirar ou depositar dinheiro, isso vai parar na contagem e � uma atualiza��o  e vai imprimir pra n�s chamar est� fun��o e imprimir certas atividades
		   
		private void showActivity ( String activity) {
		    System.out.println("YOUR RECENT TRANSACTION: " + activity);
		    System.out.println("YOUR NEW BALANCE IS: $ " + balance);
		}
		void checkBalance( ) {
			System.out.println("Balance:" + balance);
		
		}	
		
		
		void getStatus() {
			
		}
		
		@override	
		public String toString() {
			return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance +" ]";
			
		}
		public String getShowActivity() {
			return showActivity;
		}
		public void setShowActivity(String showActivity) {
			this.showActivity = showActivity;
		}
		public String getRoutingNumber() {
			return routingNumber;
		}
		public void deposit(int i) {
			// TODO Auto-generated method stub
			
		}
	}



