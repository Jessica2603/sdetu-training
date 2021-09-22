package basico;

public class NumbersCalc {
   public static void main(String[] args) {
	   System.out.println("Program is starting");
	   printName();
	   int numA = 10;
	   int numB = 20;
	   int product = multiplyNumbers(numA, numB);
	 //addNumbers(numA, numB);
       //System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA, numB));
	   System.out.println("The product of numbers " + numA + " and " + numB + " is " + product);
   }
   
 static void printName() {
     System.out.println("My name is Tim");
 }
 
 static void addNumbers(int numberA, int numberB) {
	// This function will add two numbers
	 int sum = numberA + numberB;
	 System.out.println("the sum of numbers" + numberA + " and " + numberB + " is " + sum);
 }

 static int multiplyNumbers(int valueA, int valueB) {
	 int product = valueA * valueB;
    //chamar numeros multiplicados 
	 //addNumbers(product, product);
	 return product; 
 }
 
}
